//REGULAR POLYGON PRISM CLASS
package prism;

//RegPolygonPrism is a subclass of the abstract class Prism
class RegPolygonPrism extends Prism {

    private double side;
    private int numSides;

    RegPolygonPrism() {
        super();  //"super" keyword is used to call Prism superclass constructor
        side = 0.0;
        numSides = 0;
    }

    RegPolygonPrism(double height, double side, int numSides) {
        super(height);  //"super" keyword is used to call Prism superclass constructor
        this.side = side;
        this.numSides = numSides;
    }

    double getSidePerimeter() {
        return numSides * side;  //calculates perimeter of a single side of a regular polygon prism
    }

    double getSideArea() {
        return numSides * side * side / (4 * Math.tan(Math.PI / numSides)); //calculates area of a single side of a regular polygon prism
    }

    double getVolume() {
        return super.getVolume();   //"super" keyword is used to call Prism superclass method getVolume();
    }

    double getSurfaceArea() {
        return super.getSurfaceArea();  //"super" keyword is used to call Prism superclass method getSurfaceArea();
    }

}
