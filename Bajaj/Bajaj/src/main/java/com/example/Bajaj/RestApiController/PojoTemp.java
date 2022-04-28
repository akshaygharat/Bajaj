package com.example.Bajaj.RestApiController;

import java.util.ArrayList;
import java.util.List;

public class PojoTemp {

	public boolean is_success;
	public String user_id;
	public String email;
	public String roll_number;
	public List<Integer> number=new ArrayList<>();
	public List<String> alphabets=new ArrayList<>();
	
	public PojoTemp() 
	{
		is_success=true;
		user_id="Akshay Gharat";
		email="akshaygharat9999.com";
		roll_number="210945920006";
	}
	
	
}
