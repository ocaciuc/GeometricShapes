package geometry;

import geometry.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oana on 18.05.2015.
 */
public class MathWorksheet implements Shape {

    private List<Shape> shapes = new ArrayList<Shape>();

    public void drawShape() {
        for(Shape shape : shapes) {
            shape.drawShape();
        }
    }

    public String getType() {
        return null;
    }

    public void add(Shape s){
        if(s == null){throw new NullPointerException("There is no shape to add");}
        this.shapes.add(s);
    }

    public void remove(Shape s){
        if(s == null || shapes.size() == 0){throw new NullPointerException("There is no shape to remove");}
        shapes.remove(s);
    }

    public int getShapesCount(){
        return shapes.size();
    }
}
