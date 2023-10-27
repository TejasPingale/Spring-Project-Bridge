package com.tejaspractice.SpringProject;

import org.springframework.stereotype.Component;

@Component
public class Bridge {

	private int bridgeNumber;
	private String bridgeCity;
	private String bridgeLength;
	private String bridgeWeidth;
	public Bridge() {
		super();
	}
	public Bridge(int bridgeNumber, String bridgeCity, String bridgeLength, String bridgeWeidth) {
		super();
		this.bridgeNumber = bridgeNumber;
		this.bridgeCity = bridgeCity;
		this.bridgeLength = bridgeLength;
		this.bridgeWeidth = bridgeWeidth;
	}
	public int getBridgeNumber() {
		return bridgeNumber;
	}
	public void setBridgeNumber(int bridgeNumber) {
		this.bridgeNumber = bridgeNumber;
	}
	public String getBridgeCity() {
		return bridgeCity;
	}
	public void setBridgeCity(String bridgeCity) {
		this.bridgeCity = bridgeCity;
	}
	public String getBridgeLength() {
		return bridgeLength;
	}
	public void setBridgeLength(String bridgeLength) {
		this.bridgeLength = bridgeLength;
	}
	public String getBridgeWeidth() {
		return bridgeWeidth;
	}
	public void setBridgeWeidth(String bridgeWeidth) {
		this.bridgeWeidth = bridgeWeidth;
	}
	@Override
	public String toString() {
		return "Bridge [bridgeNumber=" + bridgeNumber + ", bridgeCity=" + bridgeCity + ", bridgeLength=" + bridgeLength
				+ ", bridgeWeidth=" + bridgeWeidth + "]";
	}
	
	

	}
