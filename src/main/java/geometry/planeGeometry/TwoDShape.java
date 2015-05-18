package geometry.planeGeometry;

import geometry.Shape;

/**
 * Created by Oana on 05.05.2015.
 */
public abstract class TwoDShape implements Shape
{
    public String getType()
    {
        return this.getClass().getSimpleName();
    }

    public void drawShape()
    {
        System.out.println("-- geometry.Shape --");
    }

}
