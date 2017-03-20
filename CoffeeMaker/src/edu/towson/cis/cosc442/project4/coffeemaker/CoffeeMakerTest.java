package edu.towson.cis.cosc442.project4.coffeemaker;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	private Recipe[] recipes;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();
		recipes = cm.getRecipes();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}

	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}
	
	public void testAddRecipe3(){
		cm.addRecipe(r1);
		Recipe r2 = new Recipe();
		r2.setName("Coffee");
		r2.setPrice(50);
		r2.setAmtCoffee(6);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);
		assertFalse(cm.addRecipe(r2));
	}
	
	public void testAddRecipe4(){
		cm.addRecipe(r1);
		
		Recipe r2 = new Recipe();
		r2.setName("Coffee2");
		r2.setPrice(50);
		r2.setAmtCoffee(6);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);
		cm.addRecipe(r2);
		
		Recipe r3 = new Recipe();
		r3.setName("Coffee3");
		r3.setPrice(50);
		r3.setAmtCoffee(6);
		r3.setAmtMilk(1);
		r3.setAmtSugar(1);
		r3.setAmtChocolate(0);
		cm.addRecipe(r3);
		
		Recipe r4 = new Recipe();
		r4.setName("Coffe4");
		r4.setPrice(50);
		r4.setAmtCoffee(6);
		r4.setAmtMilk(1);
		r4.setAmtSugar(1);
		r4.setAmtChocolate(0);
		cm.addRecipe(r4);
		
		Recipe r5 = new Recipe();
		r5.setName("Coffe5");
		r5.setPrice(50);
		r5.setAmtCoffee(6);
		r5.setAmtMilk(1);
		r5.setAmtSugar(1);
		r5.setAmtChocolate(0);
		
		assertFalse(cm.addRecipe(r5));
		
		
		
	}
	

	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}
	
	public void testDeleteRecipe2(){
		assertFalse(cm.deleteRecipe(r1));
	}

	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	public void testAddInventory1(){
		assertTrue(cm.addInventory(1, 2, 0, 4));
	}
	
	public void testAddInventory2(){ //seems to be not right
		assertFalse(cm.addInventory(1, 2, 3, 4));
	}
	
	public void testAddInventory3(){
		assertFalse(cm.addInventory(-1, -1, -1, -1));
	}
	
	public void testCheckInventory(){
		assertEquals(i,cm.checkInventory());
	}
	
	public void testPurchaseBeverage1(){
		cm.addRecipe(r1);
		assertEquals(10,cm.makeCoffee(r1, 60));
	}
	
	public void testPurchaseBeverage3(){
		cm.addRecipe(r1);
		assertEquals(30,cm.makeCoffee(r1, 30));
	}
	
	public void testGetRecipeForName(){
		cm.addRecipe(r1);
		assertEquals("Coffee",cm.getRecipeForName("Coffee").getName());
	}
	
	
}