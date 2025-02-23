package ac.za.cput;

public class Main {
    public static void main(String[] args) {


       int[] array1 = {2, 6,10};
       int[] array2 = {3, 15,9};

       //Create a new array to hold the merged result

        int[] mergedArray = new int[array1.length + array2.length];

        //Copy elements from the first array
        for (int i = 0; i < array1.length ; i++) {

            mergedArray[i] = array1[i];
        }

        //Copy elements from second array
        for (int i = 0; i < array2.length ; i++) {

            mergedArray[array1.length + i] = array2[i];
        }

        //Print the merged array
        System.out.println("Merged Array: ");
        for (int num: mergedArray)
        {
            System.out.print(num + " ");
        }

    }
}