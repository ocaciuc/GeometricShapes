/**
 * Created by Oana on 05.05.2015.
 */
public class Cylinders extends ThreeDShape
{
    public int height;
    CircleTopics circle;

    public Cylinders(int radius, int height)
    {
        this.height = height;
        this.circle = new CircleTopics(radius);
    }
    public double calculateVolume()
    {
        return circle.calculateArea()*height;
    }

}
