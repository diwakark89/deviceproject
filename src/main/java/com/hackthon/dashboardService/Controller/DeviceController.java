package com.hackthon.dashboardService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackthon.dashboardService.Service.DeviceService;
import com.hackthon.entity.Device;

@RestController
public class DeviceController {

	@Autowired
	private DeviceService deviceService;

	public void setDeviceService(DeviceService deviceService) {
		this.deviceService = deviceService;
	}
	
	@RequestMapping("/fetchDevice")
	public List<Device> fetchDevice() {
		
		
		return deviceService.findAll();
	}
	
	
}
