package com.tradeshift.coding.triangleTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tradeshift.coding.triangleTask.shape.ShapeFacade;

/**
 * Application to get type of shape based on provided values
 *
 */
public class Application
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.print("Enter length of sides separated by spaces: ");
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] values = br.readLine().split(" ");
		
		ShapeFacade shapeFacade = new ShapeFacade();
		System.out.println("Type of shape is : " + shapeFacade.getShapeType(values));
	}
}
