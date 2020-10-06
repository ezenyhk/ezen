package src.Ex23;

public class Main {
    public static double sumArea(Shape[] shapes) {
		/*
			(1) sumArea�޼��带 �ۼ��Ͻÿ�.
		*/
        double sum = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].calcArea();
        }
        return sum;
    }
        public static void main (String[]args) {
            Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
            System.out.println("������ ��:" + sumArea(arr));
        }
    }


