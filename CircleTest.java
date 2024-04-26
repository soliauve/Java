class Shape { //부모 클래스 먼저 작성
    int x,y;
}

class Circle extends Shape{ //섭클래스 작성
    int radius;

    public Circle(int radius){ //create an instance of circle.
        this.radius = radius;
        x = 0;
        y = 0;
    }


    double getArea()
    {
        return 3.14 * radius * radius;
    }
}

public class CircleTest {
    public static void main(String args[])
    {
        Circle obj = new Circle(10);
        System.out.println("원의 중심: (" +obj.x + "," + obj.y + ")");
        System.out.println("원의 면적: " + obj.getArea());
    }
}