package com.valkyrie.search;

public class BinarySearch {
    private final int[] sortedArray;

    private BinarySearch(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public static BinarySearch initializeSearch(int[] sortedArray) {
        return new BinarySearch(sortedArray);
    }

    public void findTheNumber(int left, int right, int number) {
        if(left >= right) {
            System.out.println(String.format("Number %d is not present: ", number));
            return;
        }

        int mid = left + (right - left) / 2;

        if(sortedArray[mid] == number) {
            System.out.println(String.format("The number %d is present", number));
        } else if(sortedArray[mid] < number) {
            findTheNumber(mid + 1, right, number);
        } else {
            findTheNumber(left, mid - 1, number);
        }
    }
}
