//MYPRISMS CLASS
package prism;

class MyPrisms {

    Prism[] prisms;
    int maxNumPrisms;
    int prismCount = 0;

    MyPrisms() {
        //"this" keyword is used to call constructor with int parameter and sets default value of maxNumPrisms to 100
        this(100);
    }

    MyPrisms(int maxNumPrisms) {
        this.maxNumPrisms = maxNumPrisms;
        prismCount = 0;
        prisms = new Prism[maxNumPrisms];
    }

    void addPrism(Prism p) {

        //will print an error if the number of prisms added is greater than 100
        if (prismCount >= maxNumPrisms) {
            System.out.println("Error - too many prisms!");
            System.exit(0);
        }

        //adds a prism object with new parameters and increments prismCount to reflect the number of times an object is added
        prisms[prismCount++] = p;
    }

    //calls getVolume() for each addition to Prism[] array
    double getTotalVolume() {
        double tv = 0.0;

        for (int i = 0; i < prismCount; i++) {
            tv += prisms[i].getVolume();
        }
        return tv;
    }

    //calls getTotalSurfaceArea() for each addition to Prism[] array
    double getTotalSurfaceArea() {
        double sa = 0.0;

        for (int i = 0; i < prismCount; i++) {
            sa += prisms[i].getSurfaceArea();
        }
        return sa;
    }

    public static void main(String[] args) {

        //prism object created
        MyPrisms p = new MyPrisms(100);

        //prisms to be added
        p.addPrism(new RectangularPrism(8.0, 8.0, 8.0)); // height, width, length
        p.addPrism(new RectangularPrism(15.0, 2.0, 7.0));
        p.addPrism(new RectangularPrism(1.0, 6.0, 6.0));

        p.addPrism(new TriangularPrism(3.0, 4.0, 7.0, 9.0)); // height, side_a, side_b, side_c
        p.addPrism(new TriangularPrism(10.0, 9.0, 8.0, 7.0));

        p.addPrism(new RegPolygonPrism(12.0, 1.0, 5)); // height, side, num_sides
        p.addPrism(new RegPolygonPrism(4.0, 5.0, 4));
        p.addPrism(new RegPolygonPrism(19.0, 7.0, 9));
        p.addPrism(new RegPolygonPrism(7.0, 7.0, 7));

        System.out.println("Total Volume of all prisms = " + p.getTotalVolume());
        System.out.println("Total Surface Area of all prisms = " + p.getTotalSurfaceArea());

    }

}
