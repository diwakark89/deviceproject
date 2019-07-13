package com.devices.pojo;

import java.util.List;

public class DeviceObject {

	String type="line";
	boolean showInLegend=true;
	String name;
	String markerType="square";
	String xValueFormatString;
	String color="#F08080";
	String yValueFormatString="\"#,##0K";
	List<DataPoints> dataPoints;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isShowInLegend() {
		return showInLegend;
	}
	public void setShowInLegend(boolean showInLegend) {
		this.showInLegend = showInLegend;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarkerType() {
		return markerType;
	}
	public void setMarkerType(String markerType) {
		this.markerType = markerType;
	}
	public String getxValueFormatString() {
		return xValueFormatString;
	}
	public void setxValueFormatString(String xValueFormatString) {
		this.xValueFormatString = xValueFormatString;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getyValueFormatString() {
		return yValueFormatString;
	}
	public void setyValueFormatString(String yValueFormatString) {
		this.yValueFormatString = yValueFormatString;
	}
	public List<DataPoints> getDataPoints() {
		return dataPoints;
	}
	public void setDataPoints(List<DataPoints> dataPoints) {
		this.dataPoints = dataPoints;
	}
	
	
}
