package geometry.planeGeometry;

import geometry.planeGeometry.TwoDShape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oana on 05.05.2015.
 */
public class Polygon extends TwoDShape
{
    List<Integer> edges;

    public Polygon(){
    }

    public Polygon(List<Integer> edges){
        this.edges = edges;
    }

    public int calculatePerimeter(){
        int perimeter = 0;

        for(int edge : edges)
        {
            perimeter = perimeter + edge;
        }
        return perimeter;
    }
}