package com.config.Configuration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.Configuration.ConfClassFile;

@RestController
@RequestMapping("/")
//@Profile("")
public class ConfigurationController {

//	@Value("${application.url}")
//	private String url;
	
	@Autowired
	private ConfClassFile confClassFile;
	
	@GetMapping("/url")
	public String getUrl(){
		return confClassFile.url;
	}
	
}
