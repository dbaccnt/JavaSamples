/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java;

import java.util.ArrayList;
import java.util.List;
import model.Olive;

/**
 *
 * @author gperez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //encapsulate by creating instance fields
		/**
		 * I have a Model class, Olive, to contain and manage the data directly, 
		 * and an OlivePress class to do the processing
		 * 
		 */
		
		List<Olive> olives = new ArrayList<>();//create an instance of the Olive class to populate the array list with the olives
		//Olive olive1 = new Olive("Kalamata",0x2E0854,3); //create a new olive using that class which contains attributes of the olive
		//olives.add(olive1);//add the olive to the ArrayList by using .add
		
		//lets make the call to the Olive class passing the arguments a little simpler
		
		olives.add(new Olive("Kalamata",0x2E0854,3));//add the olive to the ArrayList by using .add

		//olive2.setOil(1); once the parameters are passed to the Olive class, this is no longer needed
		olives.add(new Olive("Kalamata",0x2E0854,3));
		
		//olive3.setOil(4);once the parameters are passed to the Olive class, this is no longer needed
		olives.add(new Olive("Ligurian",0x000000,2));
		olives.add(new Olive("Ligurian",0x000000,2));
		olives.add(new Olive("Ligurian",0x000000,2));
		olives.add(new Olive("Ligurian",0x000000,2));
		
		
		OlivePress press = new OlivePress();
		int totalOil = press.getOil(olives);
		//press.getOil(olives);
		System.out.println("Total olive oil: "+totalOil);
	}
	
	/**
	 * Now all the work is being done by the olive class, 
	 * which tells the rest of the world how much oil the olive has, 
	 * by the olive press that knows how to process the oil.
	 * and the olives are actually being created, and given their oil values, by the main method.
	 */
        
        
 }
    

