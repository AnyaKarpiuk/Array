package com.example;

public class Array {
    public static void main(String[] args) {

        // create String array with a length of 4
        String [] islands = new String[4];

        // assign String values to elements of islands array
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        // create int array with a length of 4
        int [] index = new int[4];

        // assign int values to elements of index array
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;

        int ref;

        // while y is less than 4
        while ( y < 4 ) {
            // assign element under number y from the array index to the variable ref
            ref = index[y];

            // print "island = " + String element under number ref
            // from islands array under
            System.out.print("island = ");
            System.out.println(islands[ref]);

            // increment y by 1 at the end of each loop
            y += 1;
        }

    }
}
