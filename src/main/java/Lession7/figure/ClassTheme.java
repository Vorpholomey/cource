package Lession7.figure;

import java.util.Random;

public class ClassTheme {
    public static void main(String[] args) {
        Random random = new Random();
        int sideA = random.nextInt(10) + 1;
        int sideB = random.nextInt(10) + 1;
        double sideC = Math.sqrt(sideA * sideA + sideB * sideB);
        int radius = random.nextInt(10) + 1;
        System.out.println("Вычисление периметра и площади круга:");
        Circle circle = new Circle(radius);
        System.out.println("Радиус равен: " + circle.getRadius() + "\nПериметр равен: " + circle.perimeter() +
                "\nПлощадь равна: " + circle.square());
        System.out.println("Вычисление периметра и площади прямоугольника:");
        Rectangle rectangle = new Rectangle(sideA, sideB);
        System.out.println("Сторона А равна: " + rectangle.getSideA() + " Сторона В равна: " + rectangle.getSideB() +
                "\nПериметр равен: " + rectangle.perimeter() + "\nПлощадь равна: " + rectangle.square());
        System.out.println("Вычисление периметра и площади треугольника:");
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        System.out.println("Сторона А равна: " + triangle.getSideA() + " Сторона B равна: " + triangle.getSideB() +
                " Сторона C равна: " + triangle.getSideC());
        System.out.println("Периметр равен: " + triangle.perimeter() + "\nПлощадь равна: " + triangle.square());
    }

}
