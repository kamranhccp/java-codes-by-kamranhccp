import java.util.Arrays;

public class arra {
    public static void main(String[] args){

        //Creating an array
        String[] array_names = new String[4];
        array_names = new String[] {"Kamran", "Hassan", "Khalid", "Yasir", "Mansoor"};

        System.out.println("Array is " + Arrays.toString(array_names));

        //Array String
        String[] pro_lan = {"C++", "Python", "Java", "Javascript"};

        //Prompting for d/f functions
        System.out.println("The length of Array Pro_lan is " + pro_lan.length + ".");

        System.out.println("The 3rd Element of array Pro_lan is " + pro_lan[2] + ".");

        //Print all the array
        for (int i = 0; i < array_names.length; i++)
        {
            System.out.println(array_names[i] + "");
        }

        //change a value to Array
        pro_lan[3] = ("C");

        //new Array
        System.out.println("The new Array is " + Arrays.toString(pro_lan) + ".");

        //for loop through an Array
        for(int i = 0; i < pro_lan.length; i++)
        {
            System.out.println(pro_lan[i]);
        }

        //foreach loop
        for (String i : array_names) {
            System.out.println(Arrays.toString(array_names));
        }

        //Array of Integers
        int intArray[];    //declaring array
        intArray = new int[9];  // allocating memory to
        intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};//declaring literals

        //Summing all elements in the array
        double total = 0;
        for(int z = 0; z < intArray.length; z++)
        {
            total = total + intArray[z];
        }
        System.out.println("Total Sum of the Array(from 0 to 9) is " + total );

        //Print the Integer Array
        System.out.println("The Integer Array is " + Arrays.toString(intArray) + ".");
    }
}
