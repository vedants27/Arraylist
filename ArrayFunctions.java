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

}

