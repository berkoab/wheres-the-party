package com.berko.foodtruck.model.response;

import java.util.Date;

public class Response {
	public static enum CheckinType {FOURSQUARE,TWITTER,EVENTFUL,EVENTBRITE};
	
	private String name;
	private String desc;
	private CheckinType type;
	private ResponseLocation location;
	private int hereNow;
	private String category;
	private String id;
	private Date startTime;
	private Date endtime;
	private String url;
	
	public Response() {
		location = new ResponseLocation();
	}
	
	public CheckinType getType() {
		return type;
	}

	public void setType(CheckinType type) {
		this.type = type;
	}

	public int getHereNow() {
		return hereNow;
	}

	public ResponseLocation getLocation() {
		return location;
	}

	public void setLocation(ResponseLocation location) {
		this.location = location;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setHereNow(int hereNow) {
		this.hereNow = hereNow;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public class ResponseLocation {
		
		private double lat;
		private double lng;
		private String address;
		private String city;
		private String state;
		private int postalCode;
		private String name;
		private String url;
		
		public double getLat() {
			return lat;
		}
		public void setLat(double lat) {
			this.lat = lat;
		}
		public double getLng() {
			return lng;
		}
		public void setLng(double lng) {
			this.lng = lng;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(int postalCode) {
			this.postalCode = postalCode;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}		
	}
}
