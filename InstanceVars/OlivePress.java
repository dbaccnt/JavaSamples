/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.java;

import java.util.List;
import model.Olive;

/**
 *
 * @author gperez
 */
public class OlivePress {
    
    //create an instance method that's a member of the OlivePress class
	//the method is public, so it can be called from anywhere within the app
	
	public int getOil(List<Olive> olives){
		
		int totalOil = 0;
		
		for(Olive o: olives){
			System.out.println(o.getName());
			totalOil += o.crush();
		}
		return totalOil;
		
	}
    
}
