package com.tradeshift.coding.triangleTask.shape;

public class ShapeFactory {
	
	public static Shape createShape(String[] sides) {
		if (sides.length == 3) {
			return new Triangle(Double.parseDouble(sides[0]),
					Double.parseDouble(sides[1]), Double.parseDouble(sides[2]));
		} 

		throw new UnsupportedOperationException("Not possible to create shape with given values");
	}

}
