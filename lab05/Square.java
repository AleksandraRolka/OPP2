
public class Square extends Point {

    protected double side;

    Square(double side, double x, double y)
    {
        super(x, y);
        this.side = side;
    }

    @Override
    public String toString()
    {
        return "Corner = " + super.toString() + "; side = " + side;
    }

    @Override
    public double area()
    {
        return side * side;
    }
}