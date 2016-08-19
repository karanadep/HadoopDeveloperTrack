package com.cloudwick.training.core.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonExample {
	
	public static void main(String[] args){
		//writeJsonData("user.json");
		readJSONData("user.json");
	}
	
	private static void writeJsonData(String filename) {
		JSONObject obj = new JSONObject();
		
		obj.put("name", "myname");
		obj.put("age",new Integer(20));
		
		JSONObject obj2 = new JSONObject();
		obj2.put("office", "123");
		obj2.put("home", "345");
		JSONArray arr = new JSONArray();
		arr.add(obj2);
		
		JSONObject obj3 = new JSONObject();
		obj3.put("office", "000");
		obj3.put("home", "899");
		arr.add(obj3);
		
		obj.put("addresses", arr);
		
		FileWriter writer;
		try {
			writer = new FileWriter(filename);
			writer.write(obj.toJSONString());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void readJSONData(String filename){
		try {
			JSONParser parser = new JSONParser();
			Object obj;
			obj = parser.parse(new FileReader(filename));
			JSONObject json = (JSONObject) obj;
			
			System.out.println("Name: " + json.get("name"));
			System.out.println("Name: " + json.get("age"));
			
			JSONArray arr = (JSONArray) json.get("addresses");
			
			Iterator<JSONObject> obj2 = arr.iterator();
			
			while (obj2.hasNext()) {
				JSONObject obj3 = obj2.next();
				System.out.println(obj3.get("office"));
				System.out.println(obj3.get("home"));
			}
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
