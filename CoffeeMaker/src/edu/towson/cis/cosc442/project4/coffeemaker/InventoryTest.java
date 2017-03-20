package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {
	private Inventory inv;
	private Recipe r1;

	@Before
	public void setUp() throws Exception {
		inv = new Inventory();
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(5);
		r1.setAmtSugar(5);
		r1.setAmtChocolate(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetChocolate() {
		inv.setChocolate(-1);
		assertEquals(0,inv.getChocolate());
	}
	@Test
	public void testSetCoffee(){
		inv.setCoffee(-1);
		assertEquals(0,inv.getCoffee());
	}
	@Test
	public void testSetMilk(){
		inv.setMilk(-1);
		assertEquals(0,inv.getMilk());
	}
	@Test
	public void testSetSugar(){
		inv.setSugar(-1);
		assertEquals(0,inv.getSugar());
	}
	@Test
	public void testEnoughIngredients(){
		inv.setChocolate(1);
		inv.setCoffee(1);
		inv.setMilk(1);
		inv.setSugar(1);
		
		assertFalse(inv.enoughIngredients(r1));
	}
	
	@Test
	public void testToString(){
		assertNotNull("", inv.toString());
	}

}
