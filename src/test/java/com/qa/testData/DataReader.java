package com.qa.testData;

import java.util.HashMap;

import org.testng.annotations.DataProvider;

public class DataReader {

	@DataProvider(name ="test-data")
	public Object[][] getData() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("username", "Basavaraj K");
		map.put("email", "test@gmail.com");
		map.put("currentAddress", "Karantak,India");
		map.put("permanentAddress", "Bangalore karantak india");
		return new Object[][] { { "Basavaraj K", "test@gmail.com", "Karantak,India", "Bangalore karantak india" } };
	}
}
