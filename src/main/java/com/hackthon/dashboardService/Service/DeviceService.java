package com.hackthon.dashboardService.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackthon.entity.Device;

@Repository
public interface DeviceService extends JpaRepository<Device, Integer> {
	
	
}