package practice;

// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
//-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
public static int factorial(int n) throws IllegalArgumentException{
	int fac = 1;
	if(n < 0)
		throw new IllegalArgumentException("Can't input negative value");
	if(n > 16)
		throw new IllegalArgumentException("Arithmetic Overflow");
	for (int i=n; i>0; i--)
		fac *= i;
		return fac;
	}
}
