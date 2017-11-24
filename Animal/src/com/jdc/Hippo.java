package com.jdc;

public class Hippo extends Animal{
	String type;

	public Hippo(String picture, String food, String hunger, String boundries, String location,String type) {
		super(picture, food, hunger, boundries, location);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		System.out.println("Hippo makes noise");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("Hippo eats water cress");
		// TODO Auto-generated method stub
		
	}

	
}
