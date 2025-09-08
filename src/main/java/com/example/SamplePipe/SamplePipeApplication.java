package com.example.SamplePipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SamplePipeApplication {
@GetMapping("/get")
public String msg()
{
	return "WELCOME TO KLH";
}
	public static void main(String[] args) {
		SpringApplication.run(SamplePipeApplication.class, args);
	}

}
