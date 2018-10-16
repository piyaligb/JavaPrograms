package dependencyInjection;

public class DrawMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        //triangle.draw();
        DrawingShape drawingShape = new DrawingShape();
        drawingShape.setShape(triangle);
        drawingShape.drawingShape();
        drawingShape.setShape(circle);
        drawingShape.drawingShape();
    }
}
