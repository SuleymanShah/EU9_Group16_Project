package Test_IntQ;

import java.util.ArrayList;

public class AutoObject {
    public static void main(String[] args) {

        Automobile car1= new Automobile("Honda", "Civic", "White");
        Automobile car2 = new Automobile("BMW", "XJ", "Blue");
        ArrayList<Automobile> cars= new ArrayList<Automobile>();
        cars.add(car1);
        cars.add(car2);

        car1.setColor("red");

   //     System.out.println("car1 = " + car1);
        System.out.println("cars = " + cars);


    }
}
