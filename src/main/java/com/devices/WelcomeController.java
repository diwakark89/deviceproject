package com.devices;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devices.pojo.DeviceObject;
import com.devices.services.DeviceRetriveService;

@Controller
public class WelcomeController {

	
	@Autowired
	DeviceRetriveService deviceRetriveService;
	
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/getDevices")
	public @ResponseBody List<DeviceObject> getDevices(){
		
		return deviceRetriveService.getDeviceObject();
	}
}