/**
 *  Program to count from 1 to 100
 *  for every multiple of 5: print "fizz"
 *  for every multiple of 7: print "buzz"
 *  for every multiple of 5 and 7: print "fizzbuzz"
*/ 
 

public class FizzBuzz 
{
	public static void main(String[] args) 
	{
		fizzBuzz(100);
	}
	
	/*
	 *  @param	num	the amount passed in from main
	 */
	private static void fizzBuzz(int num)
	{
		for (int i = 1; i<= num; i++)
		{
			if(((i % 5) == 0) && ((i % 7) == 0)) //Multiple of 5 & 7?
				System.out.println("fizzbuzz");
			else if ((i % 5) == 0) //Multiple of 5?
				System.out.println("fizz");
			else if((i % 7 ) == 0) //Multiple of 7?
				System.out.println("buzz");
			else
				System.out.println(i);
		}
	}
}
