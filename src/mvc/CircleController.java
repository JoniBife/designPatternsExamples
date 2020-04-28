package mvc;

public class CircleController {

    private CircleView view;
    private CircleModel model;

    public CircleController(CircleModel model, CircleView view) {
        this.view = view;
        this.model = model;
    }

    public void setCircleRadius(int radius) {
        model.radius = radius;
        view.clearCircle();
        view.drawCircle(model.radius,model.color);
    }
}
