//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Lab14b
{
	public static void main( String args[] )
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] two = {1,2,3,9,11,20,30};
		//add more test cases
		int[] three = {10,8,5,3,1};

		System.out.println(Arrays.toString(one));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Up ?  " + ArrayFunHouseTwo.goingUp(three));
		//add more test cases

		System.out.println("\n\n"+Arrays.toString(one));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Down ?  " + ArrayFunHouseTwo.goingDown(three));
		//add more test cases

		System.out.println("\n\n first 3 values greater than 8 are " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(two,3,8))  );

	}
}