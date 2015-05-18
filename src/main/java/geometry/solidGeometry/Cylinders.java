package geometry.solidGeometry;

import geometry.planeGeometry.Curve;

/**
 * Created by Oana on 05.05.2015.
 */
public class Cylinders extends ThreeDShape
{
    public int height;
    Curve circle;

    public Cylinders(int radius, int height)
    {
        this.height = height;
        this.circle = new Curve(radius);
    }
    public double calculateVolume()
    {
        return circle.calculateArea()*height;
    }

}
