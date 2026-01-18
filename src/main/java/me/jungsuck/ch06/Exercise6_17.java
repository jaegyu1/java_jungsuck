package me.jungsuck.ch06;

import java.util.Arrays;
import java.util.Random;

public class Exercise6_17 {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }

    private static int[] shuffle(int[] original) {

        int[] clonedArray = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            clonedArray[i] = original[i];
        }

        Random random = new Random();
        int randomIndex = random.nextInt(clonedArray.length);

        for (int i = 0; i < clonedArray.length; i++) {
            int temp = clonedArray[i];
            clonedArray[i] = clonedArray[randomIndex];
            clonedArray[randomIndex] = temp;
            randomIndex = random.nextInt(clonedArray.length);
        }

        return clonedArray;
    }
}
