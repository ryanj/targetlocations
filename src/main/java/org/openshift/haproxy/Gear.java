package org.openshift.haproxy;

public class Gear {
	public String gearName;
	public String gearType;
	public Integer gearBW;
	public Integer connections;
	
	
	public Gear(String gearName, String gearType, Integer gearBW,
			Integer connections) {
		super();
		this.gearName = gearName;
		this.gearType = gearType;
		this.gearBW = gearBW;
		this.connections = connections;
	}
	public String getGearName() {
		return gearName;
	}
	public void setGearName(String gearName) {
		this.gearName = gearName;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public Integer getGearBW() {
		return gearBW;
	}
	public void setGearBW(Integer gearBW) {
		this.gearBW = gearBW;
	}
	public Integer getConnections() {
		return connections;
	}
	public void setConnections(Integer connections) {
		this.connections = connections;
	}

	
	
}
