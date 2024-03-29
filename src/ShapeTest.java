public class ShapeTest {
    public static void main(String args[]){
        // declare an array of shapes, which will accept points or circles
        Shape shapes[] = new Shape[2];
        // adding one point and one circle
        shapes[0] = new Point(5,1);
        shapes[1] = new Circle(2.5,10,5);

        //Use the array reference object to display the correct information via polymorphism
        // this block only uses methods defined for all shapes, so
        // it will work for any shape that happens to be in the array
        for (Shape s : shapes)	{
            System.out.println(s.getName() + ": " +
                    s.toString() + "\nArea is " +
                    s.area() );
        }
    }
}