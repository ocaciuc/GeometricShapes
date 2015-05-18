package geometry.solidGeometry;


import geometry.Shape;

/**
 * Created by Oana on 05.05.2015.
 */
public abstract class ThreeDShape implements Shape
{

    public abstract double calculateVolume();

    public String getType()
    {
        return this.getClass().getSimpleName();
    }

    public void drawShape()
    {
        System.out.println("-- geometry.Shape --");
    }

}
