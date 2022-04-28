package com.example.Bajaj.RestApiController;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/bajaj")
public class RestApi {

	@PostMapping("/request")
	public PojoTemp response(@RequestBody String[] input) {
	  PojoTemp obj=new PojoTemp();
	  
	 for(int i=0;i<input.length;i++)
	 {
		 if(Integer.parseInt(input[i])>= 0 || Integer.parseInt(input[i]) <=1000)
				 {
					 obj.number.add(Integer.parseInt(input[i]));
				 }
				 else
					 obj.alphabets.add(input[i]);
	 }
	  
	  return obj;
	}
	
}//end of class
