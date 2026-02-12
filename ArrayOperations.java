import java.util.*;

public class ArrayOperations {

    int myArray[];
    Scanner sc = new Scanner(System.in);

    public ArrayOperations(int size) {
        myArray = new int[size];
    }

    public void populate() {
        System.out.println("Enter " + myArray.length + " integers.");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }
    }

    // Display all array elements
    public void print() {
        System.out.println("Array Elements:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(" " + myArray[i]);
        }
        System.out.println();
    }

    // Display even numbers
    public void displayEvenNumbers() {
        System.out.println("Even Numbers:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.print(" " + myArray[i]);
            }
        }
        System.out.println();
    }

    // Sum of even numbers
    public void sumOfEvenNumbers() {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                sum += myArray[i];
            }
        }
        System.out.println("Sum of Even Numbers: " + sum);
    }

    // Display method (calls other display methods)
    public void display() {
        print();
        displayEvenNumbers();
        sumOfEvenNumbers();
    }
}
