package com.example.demo;

import com.ericsson.schemas.Acknowledgment;
import com.ericsson.schemas.UserRequest;
import com.example.demo.client.soapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
@Autowired
	private soapClient client;



@PostMapping("/getResponse")
public Acknowledgment invokeSoapClientToGetResponse(@RequestBody UserRequest request){
	return  client.getResponse(request);
}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}
