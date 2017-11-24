package com.jdc;

public class Lion extends Feline {
	String name;

	public Lion(String picture, String food, String hunger, String boundries, String location, String type,
			String name) {
		super(picture, food, hunger, boundries, location, type);
		this.name = name;
		// TODO Auto-generated constructor stub

	}

	public void makeNoise() {
		System.out.println("Lion makes Round");
	}

	public void eat() {
		System.out.println("Lion eats meat");
	}

}
