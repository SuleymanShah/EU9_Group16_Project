package featureSuleyman;

import java.util.ArrayList;
import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p-> p.equals("Java"));

        System.out.println("list3 = " + list3);

        list3.removeIf(p-> p.endsWith("+"));
        System.out.println("list3 = " + list3);


        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(2,3,4,77,88,99));
        // Revers this list:
        ArrayList<Integer> reversedList=new ArrayList<>();

        for (int i = nums.size()-1; i>=0; i--) {
            reversedList.add(nums.get(i));
        }

        System.out.println("reversedList = " + reversedList);

        }


    }

