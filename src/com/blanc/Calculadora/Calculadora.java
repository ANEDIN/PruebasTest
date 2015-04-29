package com.blanc.Calculadora;

import java.lang.ArithmeticException;

public class Calculadora {

	public int add(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public int substract(int num1, int num2)
	{
		return num1 - num2;
	}
	
	public int division(int num1, int num2)	
	{
		if(num2 == 0)
		{
			throw new ArithmeticException();
		}
		return num1 / num2;
	}
}
