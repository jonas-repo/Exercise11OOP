package com.exercise11oop.model;

public class Perro 
{
	public int id;
	private String name;
	protected String breed; //can be accessed by class and subclass
	public int age;
	public double height;
	
	public Perro(int id, String name, String breed, int age, double height) 
	{
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.height = height;
	}
	
	public Perro() {
		
	}
	

	@Override
	public String toString() {
		return "Perro [id=" + id + ", name=" + name + ", breed=" + breed + ", age=" + age + ", height=" + height + "]";
	}
	
	
	
	
	
	
}
