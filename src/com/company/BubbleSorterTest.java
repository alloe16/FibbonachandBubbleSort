package com.company;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class BubbleSorterTest {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.now();
        Duration duration1 = Duration.between(localTime1,localTime2);
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => " );
            BubbleSorter.sort(arr);
            System.out.println(Arrays.toString(arr)+ " Время выполнения: "+ duration1);
        }
    }
}
