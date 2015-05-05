/**
 * Created by Oana on 05.05.2015.
 */
public class Cones extends ThreeDShape
{

    int height;
    CircleTopics circleTopics;

    public Cones(int radius, int height)
    {
        this.height = height;
        this.circleTopics = new CircleTopics(radius);
    }
    public double calculateVolume()
    {
        return (circleTopics.calculateArea()*height)/3;
    }
}
