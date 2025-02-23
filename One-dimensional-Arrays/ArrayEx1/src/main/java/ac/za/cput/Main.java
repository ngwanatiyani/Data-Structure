package ac.za.cput;

public class Main {
    public static void main(String[] args)
    {


        //Declare and initialize an array

        int[] numbers = {5,7,8,3,14};

        //Print elements of an array
        System.out.println("Elements of an array");
        for (int num:numbers)
        {
            System.out.print(num + " , ");
        }
        System.out.println();


        //FInd the maximum element

        int max = numbers[0];

        for (int i = 1; i <numbers.length ; i++)
        {
            if (numbers[i] > max)
            {
                max =numbers[i];
            }
        }

        System.out.println("Maximum: " + max);

        //Calculate the sum of the array elements

        int sum = 0;
        for(int num:numbers)
        {
            sum +=num;
        }

        System.out.println("Sum = " + sum);
        System.out.println("");
        
       //Reserve the array
        int[] reversedArray = new int[numbers.length];

        for (int i = 0; i <numbers.length ; i++)
        {
            reversedArray[i] = numbers[numbers.length - 1- i];
        }

        //Print the reversed array

        System.out.println("Reversed array: ");

        for(int num: reversedArray){
            System.out.print(num + " ");
        }


    }
}