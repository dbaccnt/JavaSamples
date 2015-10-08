/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gperez
 */
public class Olive {
	
	//The purpose of this class is to create an encapsulated Olive Press System.
	//each instance of the Olive class will represent a single piece of olive
	//to represent its properties
	
	//The keyword this is used to distinguish the variable that's a member of the instance from the argument
	
	
	//to make sure no part of the application can get to this data without going through the methods
	//we change it to private
	//the only access is through teh getters and setters
	private String name = "Kalamata";
        private long color = 0x2E0854;
        private int oil = 3;
	
	
	public Olive(){} //no arguments constructor to satisfy the compiler
	
	public Olive(String name, long color, int oil){	
		//when this constructor method gets called, the values are being passed in and are saved those values 
		//persistently in the instance variables
		this.name = name;
		this.color = color;
		this.oil = oil;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getColor() {
		return color;
	}
	public void setColor(long color) {		
		this.color = color;
	}
	public int crush() {
		System.out.println("Olive Crushed!");
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
    
    
}
