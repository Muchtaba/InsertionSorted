/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortexample;

/**
 *
 * @author niepp7406 + mukaz1657
 */
public class InsertionSortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] unsorted = new int[10]; //creates the array
        for (int i = 0; i < unsorted.length; i++) {// for loop equal to the same length of array
            unsorted[i] = (int) (Math.random() * 99);//generate a random number then placed in the array
        }

        long startTime = System.currentTimeMillis();//begin time for sorting runtime

        long total = 0; // set sorting runtime to 0
        for (int i = 0; i < 10000000; i++) {//for loop for timer to run untill stopped
            total += i;// add time to variable
        }

        insertionSort(unsorted); //Takes unsorted array and sorts it
        long stopTime = System.currentTimeMillis();//stop sorting runtime
        long elapsedTime = stopTime - startTime;// subtracts startTime from stopTime to find total elapsedTime 
        System.out.println(elapsedTime + " milliseconds");//prints out total elapsedTime
    }

    private static void printNumbers(int[] unsorted) {

        for (int i = 0; i < unsorted.length; i++)//Sorts array with every loop 
        {
            System.out.print(unsorted[i] + " ");//Prints out each step of array being sorted
        }
    }

    public static void insertionSort(int sorted[]) {
        int j; //Number of items sorted so far
        int key;// the item to be sorted
        int i; //initializes i variable
        int c = -1;//sets up counter for each swap

        for (j = 1; j < sorted.length; j++)//Start with 1 (not 0) 
        {
            key = sorted[j];//sorts into proper location
            c++;//adds one to each time loop is ran for the # of swaps
            for (i = j - 1; (i >= 0) && (sorted[i] < key); i--)//Smaller values move further from the start of the array
            {
                sorted[i + 1] = sorted[i];//adds it back to the sorted array

            }
            sorted[i + 1] = key; //Key puts the # in the proper location
            printNumbers(sorted);//prints out the sorted array
            System.out.println("\tSwaps: " + c);//prints total ammount of swaps done
        }
    }
}
