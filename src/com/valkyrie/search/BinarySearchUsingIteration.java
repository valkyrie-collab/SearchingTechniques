package com.valkyrie.search;

public class BinarySearchUsingIteration {
    private final int[] sortedArray;

    private BinarySearchUsingIteration(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public static BinarySearchUsingIteration initialize(int[] sortedArray) {
        return new BinarySearchUsingIteration(sortedArray);
    }

    public void search(int number) {
        int left = 0;
        int right = sortedArray.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(sortedArray[mid] == number) {
                System.out.printf("The number %d is present \n", number);
                return;
            } else if(sortedArray[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.printf("The number %d is not present \n", number);
    }
}
