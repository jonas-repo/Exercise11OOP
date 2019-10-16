package com.exercise11oop.app;

import com.exercise11oop.model.Perro;

public class PerroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro pluto = new Perro(10,"pluto","labrador",12,10.5);
		
		System.out.println("Pluto's age: " + pluto.age);
		System.out.println("Pluto's height: " + pluto.height);
		System.out.println("Pluto's id: " + pluto.id);
		
		System.out.println(pluto.toString());
	}

}
