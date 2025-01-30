/**
 * Metodi di ordinamento
 * completare i metodi nel file Sort.java
 */
package itis.informatics.ordinamento;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("ordinamento method");
        int[] array = generateArray(10, 0, 100);
        System.out.println("array generato");
        printArray(array);
        System.out.println("ordinamento method selection sort");
        printArray(Sort.selectionSort(array));
        System.out.println("ordinamento method insertion sort");
        printArray(Sort.insertionSort(array));
        System.out.println("ordinamento method bubble sort");
        printArray(Sort.bubbleSort(array));


    }


    public static int[] generateArray(int dimension, int min, int max) {
        int[] array = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }



}