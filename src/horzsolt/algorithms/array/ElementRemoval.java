package horzsolt.algorithms.array;

import java.util.Scanner;

public class ElementRemoval {

    public static void ElemRemoval() {
        //Scanner in = new Scanner(System.in);
        int[] intArr = {1, 2, 5, 12, 7, 3, 8};
        System.out.print("Enter Element to be deleted : ");
        int elem = 5;

        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] == elem) {
                // shifting elements
                for (int j = i; j < intArr.length - 1; j++) {
                    intArr[j] = intArr[j + 1];
                }
                break;
            }
        }

        System.out.println("Elements -- ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(" " + intArr[i]);
        }
    }
}
