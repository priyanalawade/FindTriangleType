package com.tradeshift.coding.triangleTask.shape;

public class Triangle implements Shape {

	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public String getType() {
		if (isValid()) {
			if (side1 == side2 && side2 == side3) {
				return TriangleShapeType.EQUILATERAL.toString();
			} else if ((side1 == side2 && side1 != side3)
					|| (side2 == side3 && side2 != side1)
					|| (side3 == side1 && side3 != side2)) {
				return TriangleShapeType.ISOCELES.toString();
			} else {
				return TriangleShapeType.SCALENE.toString();
			}
		} else {
			return TriangleShapeType.INVALID.toString();
		}
	}

	@Override
	public boolean isValid() {
		if (side1 == 0 || side2 == 0 || side3 == 0) {
			return false;
		}
		return true;
	}

}
