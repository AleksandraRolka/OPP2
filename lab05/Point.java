
public class Point extends Shape{

    protected double x;
    protected double y;

    Point( double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "[" + x + ", " + y + "]";
    }
}