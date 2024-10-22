package test;

import java.io.Serializable;

//pojo
class Pojo{
	private String text;
	
	private int number;
	
	@Override
	public String toString() {
		return text + " : " + number;
	}
}

//java bean
//3. implement serializable
class JavaBean implements Serializable{ //EJB - enterprise java beans
	private String text;
	
	private int number;
	
	//1. public no-arg constructor
	public JavaBean() { 
		//default
	}

	//2. getters and setters 
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

public class SpringBeanVsJavaBean {
	
	public static void main(String[] args) {
		
		Pojo pojo = new Pojo(); //POJO - plain old java object
		// any java object is a pojo
		System.out.println(pojo);
	}
}
