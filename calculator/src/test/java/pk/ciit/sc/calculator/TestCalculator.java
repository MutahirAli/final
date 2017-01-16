package pk.ciit.sc.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {
	
Calculator cal= new Calculator();
	
    @Test
	public void testMax(){
		int result=cal.findMax(5, 10, 15);
		assertEquals(15, result);
	}
    
    
    @Test
	public void testMax1(){
		int res=cal.findMax(0, -10, 15);
		assertEquals(15, res);
	}
    
    
    @Test
	public void testMax2(){
		int result= cal.findMax(-15,-10,-5);
		assertEquals(-5, result);
	}
    
    @Test
    public void testSquare(){
    	int square= cal.square(4);
    	assertEquals(16, square);
    }
    
  
    
    @Test (expected = IllegalArgumentException.class)
	public void testSquareException() throws IllegalArgumentException{
		cal.square(0);
	}


    @Test
    public void testCube(){
    	int cube= cal.cube(0);
    	assertEquals(0, cube);
    }
    
}
