package com.jdc;

public class Feline extends Animal  {
	String type;
	public Feline(String picture, String food, String hunger, String boundries, String location,String type) {
		super(picture, food, hunger, boundries, location);
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void roam() {
		System.out.println("Feline are roaming....");
		// TODO Auto-generated method stub
		
	}

}
