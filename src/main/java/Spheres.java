/**
 * Created by Oana on 05.05.2015.
 */
public class Spheres extends ThreeDShape
{
    int radius;

    public Spheres(int radius)
    {
        this.radius = radius;
    }
    public double calculateVolume()
    {
        return ((Math.PI*Math.pow(radius, 3))*4)/3;
    }
}
