package com.jdc;

public class Dog extends Canine {
	String name;
	public Dog(String picture, String food, String hunger, String boundries, String location, String type,String name) {
		super(picture, food, hunger, boundries, location, type);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public void makeNoise(){
		System.out.println("Dog makes Roat Roat");
	}
	public void eat(){
		System.out.println("Dog makes meal");
	}
	

}
