package com.assessment.duplicates;

public class DuplicateIdentifier {

//Using brute force
    public static void main(String args[]) {


        int[] ints = new int[]{1, 2, 3, 5, 5};

        System.out.println(identifyDuplicates(ints));
    }


    public static int identifyDuplicates(int[] ints) {

        int duplicate = -1;
        for (int i = 0; i < ints.length; i++) {
            for (int k = i + 1; k < ints.length; k++) {
                if (ints[k] == ints[i]) {

                    duplicate = ints[k];
                    return duplicate;

                }
            }
        }

        return duplicate;
    }


}
