package com.berko.foodtruck.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpClient {
	
	CloseableHttpClient httpclient;
	
	public HttpClient() {
		httpclient = HttpClients.createDefault();
	}
	
	public String get(String url) throws ClientProtocolException, IOException {
		
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response1 = null;
		try {
			response1 = httpclient.execute(httpGet);
		
			BufferedReader rd = new BufferedReader(
					new InputStreamReader(response1.getEntity().getContent()));
			StringBuffer result = new StringBuffer();
			String line = "";
			while((line = rd.readLine()) !=null) {
				result.append(line);
			}
			
			return result.toString();
		} finally {
		    response1.close();
		}
	}
}
