package com.berko.foodtruck.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.berko.foodtruck.http.HttpClient;
import com.berko.foodtruck.model.eventbrite.Address;
import com.berko.foodtruck.model.eventbrite.EBEvent;
import com.berko.foodtruck.model.eventbrite.EBVenue;
import com.berko.foodtruck.model.eventbrite.EventBrite;
import com.berko.foodtruck.model.eventful.Event;
import com.berko.foodtruck.model.eventful.Eventful;
import com.berko.foodtruck.model.foursquare.Foursquare;
import com.berko.foodtruck.model.foursquare.Location;
import com.berko.foodtruck.model.foursquare.Venue;
import com.berko.foodtruck.model.response.Response;
import com.berko.foodtruck.model.response.Response.ResponseLocation;
import com.google.gson.Gson;

public class FoodTruckRepository {

	private HttpClient httpClient;
	
	public FoodTruckRepository() {
		httpClient = new HttpClient();
	}
	
	public String getCheckins() {
		ArrayList<Response> responses = new ArrayList<Response>();
		responses.addAll(getFourSquareCheckins(40.711811, -74.013028, "2000"));
		responses.addAll(getEventfulEvents(40.711811, -74.013028, "2"));
		responses.addAll(getEventBriteEvents(40.711811, -74.013028, "2"));
		return new Gson().toJson(responses);
	}
	
	private ArrayList<Response> getEventfulEvents(double latitude, double longitude, String radius) {
		String url = "http://api.eventful.com/json/events/search?"
				+ "location="+latitude+","+longitude
				+ "&within="+radius+"&units=mi"
				+ "&date=Today"
				+ "&app_key="+EVENTFUL_KEY;
		System.out.println(url);
		//TODO: add start and end time with filters. work on radius
		Gson gson = new Gson();
		Eventful eventful = new Eventful();
		try {
			String json = httpClient.get(url);
			eventful = gson.fromJson(json, Eventful.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Response> responses = new ArrayList<Response>();
		for(Event event:eventful.getEvents().getEvent()) {
			Response response = new Response();
			response.setHereNow(event.getGoingCount());
			response.setType(Response.CheckinType.EVENTFUL);
			response.setId(event.getId());
			ResponseLocation responseLocation = response.getLocation();
			
			responseLocation.setAddress(event.getVenueAddress());
			responseLocation.setCity(event.getCityName());
			responseLocation.setState(event.getRegionAbbr());
			responseLocation.setPostalCode(event.getPostalCode());
			responseLocation.setLat(Double.valueOf(event.getLatitude()));
			responseLocation.setLng(Double.valueOf(event.getLongitude()));
			responseLocation.setName(event.getVenueName());
			responseLocation.setUrl(event.getVenueUrl());
			responses.add(response);
		}
		System.out.println(responses);
		return responses;
		
	}
	private ArrayList<Response> getFourSquareCheckins(double latitude, double longitude,
			String radius) {
		String url = "https://api.foursquare.com/v2/venues/trending/?"
				+ "v=20161016&"
				+ "ll="+latitude+"%2C%20"+longitude+"&"
				+ "intent=checkin&"
				+ "radius="+radius+"&"
				+ "client_id="+FOURSQUARE_CLIENT_ID+"&"
				+ "client_secret="+FOURSQUARE_CLIENT_SECRET;
		//TODO: add id, start and end time. work on radius
		Gson gson = new Gson();
		Foursquare foursquare = null;
		try {
			String json = httpClient.get(url);
			foursquare = gson.fromJson(json, Foursquare.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Response> responses = new ArrayList<Response>();
		
		for(Venue venue:foursquare.getResponse().getVenues()) {
			Response response = new Response();
			response.setHereNow(venue.getHereNow().getCount());
			response.setType(Response.CheckinType.FOURSQUARE);
			ResponseLocation responseLocation = response.getLocation();
			Location venueLocation = venue.getLocation();
			responseLocation.setAddress(venueLocation.getAddress());
			responseLocation.setCity(venueLocation.getCity());
			responseLocation.setState(venueLocation.getState());
			responseLocation.setPostalCode(Integer.valueOf(venueLocation.getPostalCode()));
			responseLocation.setLat(venueLocation.getLat());
			responseLocation.setLng(venueLocation.getLng());
			responseLocation.setName(venue.getName());
			responseLocation.setUrl(venue.getUrl());
			responses.add(response);
		}
		
		return responses;
	}
	
	private ArrayList<Response> getEventBriteEvents(double latitude, double longitude,
			String radius) {
		String url = "https://www.eventbriteapi.com/v3/events/search/?"
				+ "location.latitude="+latitude
				+ "&location.longitude="+longitude
				+ "&location.within=2mi&start_date.keyword=today"
				+ "&token="+EVENTBRITE_OATH_TOKEN;
		Gson gson = new Gson();
		EventBrite eventBrite = new EventBrite();
		
		try {
			String json = httpClient.get(url);
			eventBrite = gson.fromJson(json, EventBrite.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Response> responses = new ArrayList<Response>();
		
		for(EBEvent event:eventBrite.getEvents()) {
			Response response = new Response();
			response.setId(event.getId());
			response.setType(Response.CheckinType.EVENTBRITE);
			response.setName(event.getName().getText());
			response.setUrl(event.getUrl());
			
			ResponseLocation responseLocation = response.getLocation();
			url = "https://www.eventbriteapi.com/v3/venues/"+event.getVenueId()+"?token="+EVENTBRITE_OATH_TOKEN;

			EBVenue venue = new EBVenue();
			try {
				String json = httpClient.get(url);
				venue = gson.fromJson(json, EBVenue.class);

				Address address = venue.getAddress();
				responseLocation.setAddress(address.getAddress1());
				responseLocation.setCity(address.getCity());
				responseLocation.setState(address.getRegion());
				responseLocation.setLat(Double.valueOf(address.getLatitude()));
				responseLocation.setLng(Double.valueOf(address.getLongitude()));
				String postalCode = address.getPostalCode();
				if(postalCode!=null) {
					responseLocation.setPostalCode(Integer.valueOf(postalCode));
				}
				responseLocation.setName(venue.getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			responses.add(response);
		}
	
		return responses;
	}
}
