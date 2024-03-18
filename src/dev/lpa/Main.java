package dev.lpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] unsortedArray = getRandomArray(10);
        System.out.println(Arrays.toString(unsortedArray));
        Arrays.sort(unsortedArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static Integer[] getRandomArray(int length){
        Random random =  new Random();
        Integer[] randomArray = new Integer[length];
        for (int i = 0; i <length; ++i){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
}
