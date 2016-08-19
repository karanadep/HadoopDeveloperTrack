package com.cloudwick.training.core.json;

import java.util.ArrayList;
import java.util.List;

public class UserJSON {
	public String name = "karan";
	public int age = 20;
	public List<AddressJSON> list = new ArrayList<AddressJSON>() {
		{
			add(new AddressJSON("123", "456"));
			add(new AddressJSON("567", "789"));
		}
	};
	
}
