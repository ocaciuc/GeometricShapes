/**
 * Created by Oana on 05.05.2015.
 */
public class CircleTopics extends TwoDShape
{
    protected int radius;


    public CircleTopics(int radius)
    {
        this.radius = radius;
    }

    public double calculateCircumference()
    {
        return 2*Math.PI*radius;
    }

    public double calculateArea()
    {
        return Math.PI*Math.pow(radius,2);
    }

}
