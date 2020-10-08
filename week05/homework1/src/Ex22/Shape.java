package src.Ex22;

public abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}