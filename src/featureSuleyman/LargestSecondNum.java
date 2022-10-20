package featureSuleyman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestSecondNum {
    public static void main(String[] args) {
        /*
        2.	Write code that can find the second largest number in an array
1.	Example:  myArray = [1, 8, 5, 22]
2.	The code should print ‘8’.  But I should be able to pass in any array and it will find the second largest value.
2.	Write code that can find the second largest number in an array
1.	Example:  myArray = [1, 8, 5, 22]
2.	The code should print ‘8’.  But I should be able to pass in any array and it will find the second largest value.
         */

        Integer[] myArray = {1, 8, 5,200 ,10,1010, 55,22};
        ArrayList<Integer> myList= new ArrayList<>(Arrays.asList(myArray));

        Collections.sort(myList);
        int max=Collections.max(myList);
        System.out.println("max = " + max);
        System.out.println("list = " + myList);
        
        int a = myList.get(myList.size() - 2);

        System.out.println("a = " + a);

       



    }
}
