package geometry.planeGeometry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oana on 17.05.2015.
 */
public class Triangle extends Polygon {

    List<Integer> edges;

    public Triangle(List<Integer> edges) {
        super(edges);
    }

    public boolean isTriangle(ArrayList<Integer> edges) {
        if (edges.size() != 3)
            return false;
        else return ((edges.get(0) + edges.get(1)) > edges.get(2));
    }
}
