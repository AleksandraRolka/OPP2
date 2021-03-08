
public class Cube extends Square{

    protected double depth;

    Cube( double side, double x, double y )
    {
        super( side, x, y);
        this.depth = side;
    }

    @Override
    public String toString()
    {
        return super.toString() + "; depth = " + depth;
    }

    @Override
    public double area()
    {
        return 6 * super.area();
    }

    @Override
    public double volume()
    {
        return super.area() * depth;
    }
}