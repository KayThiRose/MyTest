package com.jdc;

public class Wolf extends Canine {
	String name;
	public Wolf(String picture, String food, String hunger, String boundries, String location, String type,String name) {
		super(picture, food, hunger, boundries, location, type);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public void makeNoise(){
		System.out.println("Wolf makes noise");
	}
	public void eat(){
		System.out.println("Wolf makes meat");
	}
	

}
