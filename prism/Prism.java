//PRISM CLASS
package prism;

//Prism is an abstract class that cannot be instantiated
abstract class Prism {

    double height;

    abstract double getSideArea();

    abstract double getSidePerimeter();

    Prism() {
        height = 0.0;
    }

    Prism(double height) {
        if (height <= 0.0) {
            System.out.println("Error - value of height is invalid");
            System.exit(0);
        }
        this.height = height;
    }

    /*  subclasses that extend Prism will also use getVolume() 
     and getSurfaceArea() methods, and will use the "super" keyword
     to access these two superclass methods  */
    double getVolume() {
        return height * getSideArea();
    }

    double getSurfaceArea() {
        return 2 * getSideArea() + height * getSidePerimeter();
    }

}
