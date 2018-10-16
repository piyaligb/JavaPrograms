package dependencyInjection;

public class DrawingShape {
    private Shape shape;

    public void setShape(Shape shape){
        this.shape = shape;
    }
    public void drawingShape(){
        this.shape.draw();
    }
}
