//ArrayFunctions.java

import java.util.*;

class ArrayFunctions {
    void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }
    void separateOddEven(int[] array) {
    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 0) {
            even.add(array[i]);
        } else {
            odd.add(array[i]);
        }
    }
    System.out.print("Even ");
    display(even);
    System.out.print("Odd ");
    display(odd);
}
    // Find the index of the first number in a pair with the smallest distance
    	int findSmallestDistanceIndex(int[] array) {
        	if (array.length < 2) {
            	throw new IllegalArgumentException("Array must have at least two elements.");
        	}

        	int minIndex = 0;
        	int minDistance = Math.abs(array[1] - array[0]);

        	for (int i = 1; i < array.length - 1; i++) {
            		int distance = Math.abs(array[i + 1] - array[i]);
            		if (distance < minDistance) {
                		minDistance = distance;
                		minIndex = i;
            		}
        	}

        	return minIndex;
    	}
    // Convert array to ArrayList
    	ArrayList<Integer> arrayToArrayList(int[] array) {
        	ArrayList<Integer> arrayList = new ArrayList<>();
        	for (int num : array) {
            	arrayList.add(num);
        	}
        	return arrayList;
    	}

}

