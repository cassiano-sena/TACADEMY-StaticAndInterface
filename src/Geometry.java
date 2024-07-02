//3. Crie uma classe Geometry com métodos estáticos para operações de cálculo de
//área de: quadrado, retangulo, triangulo, circulo, cubo, paralelepipedo, trapézio
//e esfera. Cada método deve retornar o resultado da operação correspondente.
public class Geometry {
    public static double areaOfSquare(double side) {
        return side * side;
    }
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    public static double volumeOfCube(double side) {
        return side * side * side;
    }
    public static double volumeOfRectangularPrism(double length, double width, double height) {
        return length * width * height;
    }
    public static double areaOfTrapezoid(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }
    public static double volumeOfSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
