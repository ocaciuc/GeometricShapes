/**
 * Created by Oana on 05.05.2015.
 */
public abstract class TwoDShape implements Shape
{
    public String getType()
    {
        return this.getClass().getName();
    }

    public void drawShape()
    {
        System.out.println("-- Shape --");
    }


}
