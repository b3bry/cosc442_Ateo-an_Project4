package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	private Recipe r1;

	@Before
	public void setUp() throws Exception {
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetAmtChocolate() {
		r1.setAmtChocolate(-1);
		assertEquals(0,r1.getAmtChocolate());
	}
	@Test
	public void testSetAmtCoffee() {
		r1.setAmtCoffee(-1);
		assertEquals(0,r1.getAmtCoffee());
	}
	@Test
	public void testSetAmtMilk() {
		r1.setAmtMilk(-1);
		assertEquals(0,r1.getAmtMilk());
	}
	@Test
	public void testSetAmtSugar() {
		r1.setAmtSugar(-1);
		assertEquals(0,r1.getAmtSugar());
	}
	@Test
	public void testSetPrice() {
		r1.setPrice(-1);
		assertEquals(0,r1.getPrice());
	}
	
	@Test
	public void testEquals(){
		Recipe r2 = new Recipe();
		assertFalse(r2.equals(r1));
	}
	
	@Test
	public void testEquals2(){
		Recipe r2 = new Recipe();
		r2.setName("Coffee");
		assertTrue(r2.equals(r1));
	}
	
	@Test
	public void testEquals3(){
		Recipe r2 = new Recipe();
		r2.setName("Coffee2");
		assertFalse(r2.equals(r1));
	}
	
	@Test
	public void testToString(){
		assertNotNull("",r1.toString());
	}

}
