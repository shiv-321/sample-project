package project5shape;

public class Sphere extends Shape{
    Sphere(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public double areaSphere(int dim1, int dim2){
        return 4 * Math.PI * dim1 * dim1;
    }
}
