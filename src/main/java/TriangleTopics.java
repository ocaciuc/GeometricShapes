import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oana on 05.05.2015.
 */
public class TriangleTopics extends TwoDShape
{
    protected int edgesNr;
    List<Integer> edges;


    public TriangleTopics(int edgesNr, ArrayList<Integer> edges)
    {
        this.edgesNr = edgesNr;
        this.edges = edges;
    }

    public int calculatePerimeter()
    {
        int perimeter = 0;

        for(int edge : edges)
        {
            perimeter = perimeter + edge;
        }
        return perimeter;
    }
}
