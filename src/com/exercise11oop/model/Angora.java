package com.exercise11oop.model;

public class Angora extends Cat
{
	
	private double mouthlong;
	
	public Angora()
	{
		
	}
	
	public Angora(int id, String name, int age)
	{
		super(id, name, age);
	}
	
	public Angora(int id, String name, int age, double mouthlong)
	{
		super(id, name, age);
		this.mouthlong = mouthlong;
	}

	public double getMouthlong() 
	{
		return mouthlong;
	}

	public void setMouthlong(double mouthlong)
	{
		this.mouthlong = mouthlong;
	}
	
	@Override
	public String toString() {
		return "Angora [id=" + getId() + ", name=" + getName() + ", age=" + getAge() +", mouthlong="+ mouthlong + "]";
	}
	
	@Override
	public void Meow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Scratch() {
		// TODO Auto-generated method stub
		
	}
}
