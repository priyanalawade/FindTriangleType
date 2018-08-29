package com.tradeshift.coding.triangleTask.shape;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ShapeFactoryTest
{
    @Test
    public void testCreateTriangle() {
    	String[] sides = {"4","2","3"};
		Shape s = ShapeFactory.createShape(sides);
		assertEquals(Triangle.class, s.getClass());
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateShapeWhichIsNotaTriangle() {
    	String[] sides = {"4","2"};
		ShapeFactory.createShape(sides);
    }
    
}
