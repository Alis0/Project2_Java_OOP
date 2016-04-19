//RECTANGULAR PRISM CLASS
package prism;

//RectangularPrism is a subclass of the abstract class Prism
class RectangularPrism extends Prism {

    private double length;
    private double width;

    RectangularPrism() {
        super();  //"super" keyword is used to call Prism superclass constructor
        length = 0.0;
        width = 0.0;
    }

    RectangularPrism(double height, double width, double length) {
        super(height);  //"super" keyword is used to call Prism superclass constructor
        this.width = width;
        this.length = length;;
    }

    double getSidePerimeter() {
        return 2.0 * (width + length);  //calculates perimeter of a single side of a rectangular prism
    }

    double getSideArea() {
        return width * length;   //calculates area of a single side of a rectangular prism
    }

    double getVolume() {
        return super.getVolume();  //"super" keyword is used to call Prism superclass method getVolume()
    }

    double getSurfaceArea() {
        return super.getSurfaceArea();  //"super" keyword is used to call Prism superclass method getSurfaceArea();
    }

}
