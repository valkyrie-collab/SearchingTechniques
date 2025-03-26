package com.valkyrie;

import com.valkyrie.search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4,5,6,7,8,9};
        BinarySearch search = BinarySearch.initializeSearch(list);
        search.findTheNumber(0, list.length - 1, 2);
    }
}