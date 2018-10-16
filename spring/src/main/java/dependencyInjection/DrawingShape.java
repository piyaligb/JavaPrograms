package dependencyInjection;

public class DrawingShape {
    private Shape shape = new Shape() {
        public void draw() {
            System.out.println("Inside DrawingShape");
        }
    };
    public void setShape(Shape shape){
        this.shape = shape;
    }
    public void drawingShape(){
        this.shape.draw();
    }
}
