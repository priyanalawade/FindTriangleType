package com.tradeshift.coding.triangleTask.shape;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
	
	@Test
    public void testNotValidTriangle() {
		Triangle triangle = new Triangle(0, 6, 0);
    	assertEquals(false, triangle.isValid());
    }
	
	@Test
    public void testValidTriangle() {
		Triangle triangle = new Triangle(4, 2, 4);
    	assertEquals(true, triangle.isValid());
    }
	
	@Test
    public void testEquilateralTriangle() {
		Triangle triangle = new Triangle(4, 4, 4);
		assertEquals(TriangleShapeType.EQUILATERAL.toString(), triangle.getType());
    }
	
	@Test
    public void testIsocelesTriangle() {
		Triangle triangle = new Triangle(4, 2, 4);
		assertEquals(TriangleShapeType.ISOCELES.toString(), triangle.getType());
    }
	
	@Test
    public void testScaleneTriangle() {
		Triangle triangle = new Triangle(6, 3, 2);
		assertEquals(TriangleShapeType.SCALENE.toString(), triangle.getType());
    }
	
	@Test
    public void testInValidTypeTriangle() {
		Triangle triangle = new Triangle(3, 0, 4);
    	assertEquals(TriangleShapeType.INVALID.toString(), triangle.getType());
    }
}
