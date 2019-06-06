import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Triangle triangle=new Triangle();
        System.out.println("Enter side1: ");
        double side1=scanner.nextDouble();
        System.out.println("Enter side2: ");
        double side2=scanner.nextDouble();
        System.out.println("Enter side3: ");
        double side3=scanner.nextDouble();
        scanner.nextLine(); //do nextDouble() ko tự động xuống dòng mới nên nếu ko có dòng này thì chương trình sẽ ko dừng lại để ta nhập color
        triangle=new Triangle(side1,side2,side3);
        System.out.println(triangle);

        System.out.println("Enter color");
        String color=scanner.nextLine();
        triangle.setColor(color);
        System.out.println(triangle);

    }
}

