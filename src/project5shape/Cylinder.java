package project5shape;

public class Cylinder extends Shape{
    Cylinder(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public double areaCylinder(int dim1, int dim2){
        return (Math.PI * dim1 * dim1 * dim2) + (2 * Math.PI * dim1);
    }
}
