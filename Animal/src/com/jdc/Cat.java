package com.jdc;

public class Cat extends Feline {
	String name;
	public Cat(String picture, String food, String hunger, String boundries, String location, String type,String name) {
		super(picture, food, hunger, boundries, location, type);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public void makeNoise(){
		System.out.println("Cat makes Naung");
	}
	public void eat(){
		System.out.println("Cat makes meal");
	}
	

}
