package com.selflserning.corejava.examples;

public class RemoveDuplicatesFromSortedIntegerArray {

	public static void main(String[] args) {

		int arr[] = { 0, 3, 5 };
		int j = 1;

		System.out.println("Length: " + arr.length);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i + 1];
				j++;
			}
		}

		System.out.println("Output count: " + j);

		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
