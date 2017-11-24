package com.jdc;

public class Tiger extends Feline {
	String name;
	public Tiger(String picture, String food, String hunger, String boundries, String location, String type,String name) {
		super(picture, food, hunger, boundries, location, type);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public void makeNoise(){
		System.out.println("Tiger makes Round Round");
	}
	public void eat(){
		System.out.println("Tiger makes meat");
	}


}
