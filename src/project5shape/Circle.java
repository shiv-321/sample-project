package project5shape;

public class Circle extends Shape{
    Circle(int dim1, int dim2){
        super(dim1, dim2);
    }
    public double areaCircle(int dim1){

        return Math.PI * dim1 * dim1;
    }
}