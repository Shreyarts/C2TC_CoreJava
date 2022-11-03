package com.capgemini.arrays;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,3,4},{5,6,7}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
