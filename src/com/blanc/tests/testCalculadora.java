package com.blanc.tests;

import com.blanc.Calculadora.Calculadora;

import junit.framework.TestCase;

public class testCalculadora extends TestCase {

	private Calculadora calc;
	
	public void setUp() throws Exception
	{
		super.setUp();
		calc = new Calculadora();
	}
	
	public void tearDown() throws Exception
	{
		super.tearDown();
		calc = null;
	}
	
	public void testAdd() throws Exception
	{
		
		int resultat = calc.add(10, 20);
		assertEquals(30, resultat, 0);
	}
	
	public void testSubstract() throws Exception
	{
		Calculadora calc = new Calculadora();
		int resultat = calc.substract(20, 10);
		assertEquals(10, resultat, 0);
	}
	
	@Test(expected=ArithmeticException)
	public void testDivision() throws Exception
	{
		Calculadora calc = new Calculadora();
		int resultat = calc.substract(20, 10);
		assertEquals(10, resultat, 0);
	}
	
}
