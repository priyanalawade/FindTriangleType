package com.tradeshift.coding.triangleTask.shape;

public enum TriangleShapeType {
	
	EQUILATERAL("Equilateral Triangle"), ISOCELES("Isoceles Triangle"), SCALENE("Scalene Triangle"), INVALID("Cannot create triangle with given input values");

	public String description;
	
	private TriangleShapeType(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}
	
}
