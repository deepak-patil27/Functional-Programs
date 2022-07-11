package com.bridgelab;
public class IntegerAddsZero {
	public static void main (String[] args){
		int[] arr = {1, -2, 4, -3, -1, 5, 6};

		for(int i = 0; i < arr.length; i++) {
			int firstNumber = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				System.out.println("firstBumber");
				int secondNumber = arr[j];
				for(int k = j+1; k < arr.length; k++) {
					int thirdNumber = arr[k];

					int sum = firstNumber + secondNumber + thirdNumber;
					if(sum == 0) {
						System.out.println(firstNumber+","+secondNumber+","+thirdNumber);
	                    System.out.println();
					}
				}
			}
		}
	}

}
