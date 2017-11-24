package com.jdc;

public class Main {
	public static void main(String[] args) {
		Lion l = new Lion("Pretty","Meat"," Ever Hunger","Boundries","Forest","Biggest","Jackie");
		System.out.println("Lion Picture : " +l.picture);
		System.out.println("Lion Food : " +l.food);
		System.out.println("Lion Hunger : " +l.hunger);
		System.out.println("Lion Boundries : " +l.boundries);
		System.out.println("Lion Location : " +l.location);
		System.out.println("Lion Type : " +l.type);
		System.out.println("Lion Name : " +l.name);
		l.makeNoise();
		l.eat();
		
		
	}

}
