package com.devices.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.devices.pojo.DataPoints;
import com.devices.pojo.DeviceObject;

@Service
public class DeviceRetriveService {

	public List<DeviceObject> getDeviceObject() {

		List<DeviceObject> deviceObjects = new ArrayList<>();
		List<DataPoints> dataPoints = new ArrayList<>();

		for (int j = 0; j < 5; j++) {
			DeviceObject deviceObject=new DeviceObject();
			deviceObject.setName("Device"+j);
			Calendar cls = Calendar.getInstance();
			cls.setTime(new Date());
			cls.add(Calendar.DAY_OF_YEAR, j);
			for (int i = 1; i < 15; i++) {
				DataPoints dataPoint = new DataPoints();
				Calendar c = Calendar.getInstance();
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_YEAR, i);
				dataPoint.setX(c.getTime());
				Random r = new Random();
				int randomInt = r.nextInt(100) + 1;
				dataPoint.setY(randomInt);
				dataPoints.add(dataPoint);
			}
			deviceObject.setxValueFormatString(""+cls.get(Calendar.MONTH)+","+cls.get(Calendar.DATE));
			deviceObject.setDataPoints(dataPoints);
			deviceObjects.add(deviceObject);
		}
		return deviceObjects;
	}

}
