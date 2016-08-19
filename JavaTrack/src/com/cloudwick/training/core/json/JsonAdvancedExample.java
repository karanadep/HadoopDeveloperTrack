package com.cloudwick.training.core.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonAdvancedExample {
	public static void main(String[] args){
		UserJSON obj = new UserJSON();
		ObjectMapper mapper = new ObjectMapper();
		FileWriter fw;
		try {
			fw = new FileWriter("user.json");			
			fw.write(mapper.writeValueAsString(obj));
			fw.flush();
			fw.close();
			
			UserJSON obj2 = mapper.readValue(new File("user.json"), UserJSON.class);
			System.out.println("name " + obj2.name);
			System.out.println("age " + obj2.age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
}

