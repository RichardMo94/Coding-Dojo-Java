package com.codingdojo.phone;

public class Iphone extends Phone implements Ringable{
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
    public String ring() {
        return getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocked!";
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone version " +getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage()+ "% battery.");            
    }
}
