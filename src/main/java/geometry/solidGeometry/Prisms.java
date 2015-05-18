package geometry.solidGeometry;

import geometry.planeGeometry.Curve;
import geometry.planeGeometry.Polygon;

import java.util.ArrayList;

/**
 * Created by Oana on 05.05.2015.
 */
public class Prisms extends ThreeDShape
{
    Polygon triangle;
    int length;

    public  Prisms(int length, int edgesNr, ArrayList<Integer> edges)
    {
        this.length = length;
        this.triangle = new Polygon(edges);
    }

    public double calculateVolume()
    {
        // triangle.getArea()*length
        return 10;
    }

}
