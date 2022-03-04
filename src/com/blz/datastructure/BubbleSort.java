package com.blz.datastructure;

import java.util.Scanner;

/*
 //* @Purpose: BubbleSort Sort
    a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
    b. I/P -> read in the list words
    c. Logic -> Use Insertion Sort to sort the words in the String array
    d. O/P -> Print the Sorted List
 //* @file : InsertionSort.java
 //* @author : Karthik M C
*/

public class BubbleSort {
    static Scanner scanner = new Scanner(System.in);

    /*
     * @purpose: Ability to BubbleSort sort
     * @param: Takes String array as input
     * @function : sorts the given array in ascending order and stores them in their
     * indecencies
     * @return: No return value.
     */
    static public void bubbleSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            int size = array.length;

            // loop to access each array element
            for (int j = 0; j < size - 1; j++)

                // loop to compare array elements
                for (int k = 0; k < size - j - 1; k++)

                    // compare two adjacent elements
                    // change > to < to sort in descending order
                    if (array[k].compareTo(array[k + 1]) > 0) {

                        // swapping occurs if elements
                        // are not in the intended order
                        String temp = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = temp;
                    }
        }
    }

    /*
     * @purpose: Ability to print String array
     * @param: Takes String array as input
     * @function : print the given string array
     * @return: No return value.
     */
    static public void printString(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println("string at index " + i + " is " + strings[i]);
        }
    }

    /*
     * @purpose: Ability to scan String array
     * @param: Takes String array as input
     * @function : scans the data from user and stores in to string array
     * @return: No return value.
     */
    static public void scanString(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("Enter the string at index :%d\n", i);
            strings[i] = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        String[] strings = new String[5];
        scanString(strings);
        System.out.println("***********************Before Sort*************************");
        printString(strings);
        bubbleSort(strings);
        System.out.println("***********************After Sort*************************");
        printString(strings);

    }
}
