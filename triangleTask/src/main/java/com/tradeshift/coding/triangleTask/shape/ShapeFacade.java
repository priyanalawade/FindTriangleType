package com.tradeshift.coding.triangleTask.shape;

import com.tradeshift.coding.triangleTask.shape.util.InputValidator;

public class ShapeFacade {

	public String getShapeType(String[] sides) {
		InputValidator.validateInput(sides);
		Shape shape = ShapeFactory.createShape(sides);
		return shape.getType();
	}
}
