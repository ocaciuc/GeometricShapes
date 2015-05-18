import junit.framework.TestCase;
import org.testng.Assert;
import geometry.planeGeometry.Curve;

/**
 * Created by Oana on 05.05.2015.
 */
public class CurveTest extends TestCase
{
    Curve circleTopics = new Curve(10);

    public void testGetType()
    {
        Assert.assertEquals(circleTopics.getType(), "Curve");
    }

    public void testCircumferince()
    {
        Assert.assertTrue(circleTopics.calculateCircumference() > 0);
    }


}
