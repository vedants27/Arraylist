// Name - Vedant Shitole
// Prn - 23070126143
// Batch - Aiml B3 2023-2027
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayInput arrayInput = new ArrayInput();
        ArrayFunctions functions = new ArrayFunctions();

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Separate Even and Odd numbers\n2. Find index of closest neighboring numbers\n3. Convert Array to ArrayList\n4. Convert ArrayList to Array\n0. Exit");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> {
                int[] array = arrayInput.getUserArray();
                functions.separateOddEven(array);
                  }
                case 2 -> {
               int[] array = arrayInput.getUserArray();
               int index = functions.findSmallestDistanceIndex(array);
                System.out.println("Index of the first number in the closest pair: " + index);
                  }


            }
        }
    }
}

