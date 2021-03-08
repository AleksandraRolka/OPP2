
public abstract class Shape{

    public String getName()
    {
        return this.getClass().getName();
    }
    public abstract String toString();
    public double area() { return 0; }
    public double volume() { return 0; }
}