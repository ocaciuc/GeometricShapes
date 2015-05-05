import junit.framework.TestCase;
import org.testng.Assert;

/**
 * Created by Oana on 05.05.2015.
 */
public class CircleTopicsTest extends TestCase
{
    CircleTopics circleTopics = new CircleTopics(10);

    public void testGetType()
    {
        Assert.assertEquals(circleTopics.getType(), "CircleTopics");
    }

    public void testCircumferince()
    {
        Assert.assertTrue(circleTopics.calculateCircumference() > 0);
    }
}
