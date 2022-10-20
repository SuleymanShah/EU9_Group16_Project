package Test_IntQ;

public class Automobile {

    /*
    1.	Create a new class called Automobile.  The class should have attributes of Make (ex. Honda), Model (ex. Civic) and Color (your favorite color)
1.	Set the Make Model and Color and then print each attribute

     */
    private String make;
    private String model;
    private String color;

    public Automobile(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
