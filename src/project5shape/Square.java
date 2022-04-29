package project5shape;

public class Square extends Shape{
    Square(int dim1, int dim2){
        super(dim1,dim2);
    }
    public int areaSquare(int dim1){
        return dim1*dim1;
    }

}