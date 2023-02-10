public class Main implements Printable {
    public static void main(String[] args) {
        Circle circle = new Circle("круг", 111);
        Triangle triangle = new Triangle("треугольник", 55, 40, 35);
        Square square = new Square("квадрат", 23);
        Rectangle rectangle = new Rectangle("прямоугольник", 55, 77);
        Car car = new Car("mers");
        Bus bus = new Bus("ikarus");
        Drawable[] drawables = {circle, triangle, square, rectangle, car, bus};

        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
            if (drawables[i] instanceof Figure) {


                System.out.println(((Figure) drawables[i]).getName() + "Периметр -> "
                        + ((Figure) drawables[i]).calculatePerimeter());

            }
            if (drawables[i] instanceof Transport) {
                System.out.println(((Transport) drawables[i]).getName());
            }

        }


    }

    @Override
    public void print() {

    }

    private String ClassName = "bear";

    public static String createObject(String ClassName) {
        switch (ClassName){
            case "bear":
                bear bear = new bear(250,3);
                System.out.println(" bear");
        }



        return ClassName;
    }
}
//Animal[] animals = {new bear(200,3), new lion(5,10),
// new wolf(2, 25), new tiger("orange", 500)};