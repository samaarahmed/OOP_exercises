package lexicon.se;

/**
 * Make a program that can print out “drive” method in a OOP way.
 * Create a class “Car” with the following fields:
 * id, year, model, colour, motorSize.
 * b. Create a public method “drive” inside “Car” which will print:
 * model + ” with motor ” + motorSize + ” can drive now.”
 * c. In the main program make instance of “Car” and call the method “drive”.
 * <p>
 * - Covering class design and instances
 */
public class Car {

    private String id;
    private int year;
    private String model;
    private String colour;
    private double motorSize;
    // Constructors

    public Car(String id, int year, String model, String colour, double motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.colour = colour;
        this.motorSize = motorSize;
    }


    public Car() {
    }
    // Methods

    public void drive() {
        System.out.println(model + " " + "with motor" + " " + motorSize + " " + "can drive now");
    }

    // Getter and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(double motorSize) {
        this.motorSize = motorSize;
    }
}
