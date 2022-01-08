package lexicon.se;

    /**Make a program that prints out the area on a rectangle in a OOP way.
        a. Create a class “Rectangle” with the following fields:
        height, width. (both should be double values.)
        b. Make two constructors, one default constructor without parameters and the second
        constructor which should take two parameters (height and weight).
        c. Add getter and setter for height and width fields.
        d. Write public method “getArea” which will return area (height*weight).
        e. In the main program create instance of that “Rectangle” and ask user for height and
        width and then print calculated area.
        -Covering Constructors, getters, and setters*/

public class Rectangle {

    private double height;
    private double width;
    //Constructors
        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        public Rectangle() {
        }
        //Methods

        public double getArea(){
            return height * width;
        }


        //Getters and setters

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }
    }
