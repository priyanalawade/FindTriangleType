package com.tradeshift.coding.triangleTask.shape;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShapeFacadeTest {
	
	@Test(expected = IllegalArgumentException.class)
    public void testNullInput() {
		ShapeFacade s = new ShapeFacade();
		s.getShapeType(null);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testEmptyInput() {
		String[] sides = {};
		ShapeFacade s = new ShapeFacade();
		s.getShapeType(sides);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testNotANumberInput() {
		String[] sides = {"test"};
		ShapeFacade s = new ShapeFacade();
		s.getShapeType(sides);
    }
	
	public void testValidInput() {
		String[] sides = {"1", "6", "1"};
		ShapeFacade s = new ShapeFacade();
		String type = s.getShapeType(sides);
		assertEquals(TriangleShapeType.ISOCELES.toString(), type);
    }
}
