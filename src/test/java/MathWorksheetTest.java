import geometry.MathWorksheet;
import geometry.Shape;
import geometry.planeGeometry.Curve;
import geometry.planeGeometry.Polygon;
import geometry.planeGeometry.Triangle;
import geometry.solidGeometry.Cones;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Oana on 18.05.2015.
 */
public class MathWorksheetTest extends TestCase{

    MathWorksheet worksheet = new MathWorksheet();

    List<Integer> hexaEdges = new ArrayList<Integer>(Arrays.asList(1, 33, 5, 5,7));
    List<Integer> triangleEdges = new ArrayList<Integer>(Arrays.asList(1, 5,7));

    Triangle triangle = new Triangle(triangleEdges);
    Cones cones = new Cones(4, 8);
    Curve curve = new Curve(4);
    Polygon polygon = new Polygon(hexaEdges);

    public void testDrowShape(){
        worksheet.add(triangle);
        worksheet.add(cones);
        worksheet.drawShape();
        Assert.assertEquals(worksheet.getShapesCount(), 2);
    }

    public void testAddShape(){
        worksheet.add(curve);
        worksheet.add(polygon);
        worksheet.add(polygon);
        Assert.assertEquals(worksheet.getShapesCount(), 3);
    }

    public void testRemoveShape(){
        worksheet.add(polygon);
        worksheet.remove(polygon);
        Assert.assertEquals(worksheet.getShapesCount(), 0);
    }
}
