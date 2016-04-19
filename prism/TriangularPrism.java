//TRIANGULAR PRISM CLASS
package prism;

//TriangularPrism is a subclass of the abstract class Prism
class TriangularPrism extends Prism {

    private double side_a;
    private double side_b;
    private double side_c;

    TriangularPrism() {
        super();  //"super" keyword is used to call Prism superclass constructor
        side_a = 0.0;
        side_b = 0.0;
        side_c = 0.0;
    }

    TriangularPrism(double height, double side_a, double side_b, double side_c) {
        super(height);  //"super" keyword is used to call Prism superclass constructor
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    double getSidePerimeter() {
        return side_a + side_b + side_c;    //calculates perimeter of a single side of a triangular prism
    }

    double getSideArea() {
        double s = (side_a + side_b + side_c) / 2.0;

        return Math.sqrt(s * (s - side_a) * (s - side_b) * (s - side_c));   //calculates area of a single side of a triangular prism
    }

    double getVolume() {
        return super.getVolume();   //"super" keyword is used to call Prism superclass method getVolume()
    }

    double getSurfaceArea() {
        return super.getSurfaceArea();  //"super" keyword is used to call Prism superclass method getSurfaceArea();
    }

}
