package com.exercise11oop.app;

import com.exercise11oop.model.Perro;

public class PerroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro pluto = new Perro(10,"pluto","labrador",12,80.5);
		Perro firulais  = new Perro();
		
		System.out.println(pluto.toString());
		System.out.println(firulais.toString());
	}

}
