package lexicon.se;


public class App 
{
    public static void main( String[] args )
    {
        //Exercise 1

        // using constructors
       Car car = new Car("ab20",2020,"E220","blue",2.4 );
       car.drive();


        // Using getters and setters
        Car car1 = new Car();
        car1.setId("ab25");
        car1.setModel("v90");
        car1.setYear(2021);
        car1.setColour("Black");
        car1.setMotorSize(3.0);
        System.out.println("ID:"+car1.getId()+" Model: "+car1.getModel()+
                " Year: "+car1.getYear()+
                " Color: "+car1.getColour()+
                " Motorsize: "+ car1.getMotorSize());
        car1.drive();

    // Exercise 2

        Rectangle rectangle = new Rectangle(5,20);
        System.out.println("Area of rectangle is: "+ rectangle.getArea());
    }
}
