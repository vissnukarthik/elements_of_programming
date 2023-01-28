package OOPs;
//
abstract class GraphicObject {
    int x, y;
    abstract void draw();
    abstract void resize();
}

class Circle extends GraphicObject {
    void draw() {
        System.out.println("drawn circle");
    }
    void resize() {
        System.out.println("re-size circle");
    }
}

public class abstract_cls {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
