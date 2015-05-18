package geometry.solidGeometry;

import geometry.planeGeometry.Curve;

/**
 * Created by Oana on 05.05.2015.
 */
public class Cones extends ThreeDShape
{

    int height;
    Curve circleTopics;

    public Cones(int radius, int height)
    {
        this.height = height;
        this.circleTopics = new Curve(radius);
    }
    public double calculateVolume()
    {
        return (circleTopics.calculateArea()*height)/3;
    }
}
