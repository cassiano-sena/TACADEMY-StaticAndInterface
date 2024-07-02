import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("\n\n\n");
        System.out.println("1:");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Displaying the number of Counter instances created
        System.out.println("Number of Counter instances created: " + Counter.getCount());

        //2
        System.out.println("\n\n\n");
        System.out.println("2:");
        double celsius1 = 0.0;
        double celsius2 = 37.0;
        double fahrenheit1 = 32.0;
        double fahrenheit2 = 98.6;

        System.out.println(celsius1 + "°C to Fahrenheit: " + TemperatureConverter.celsiusToFahrenheit(celsius1) + "°F");
        System.out.println(celsius2 + "°C to Fahrenheit: " + TemperatureConverter.celsiusToFahrenheit(celsius2) + "°F");
        System.out.println(fahrenheit1 + "°F to Celsius: " + TemperatureConverter.fahrenheitToCelsius(fahrenheit1) + "°C");
        System.out.println(fahrenheit2 + "°F to Celsius: " + TemperatureConverter.fahrenheitToCelsius(fahrenheit2) + "°C");


        //3
        System.out.println("\n\n\n");
        System.out.println("3:");
        double squareSide = 5;
        double rectangleLength = 10, rectangleWidth = 4;
        double triangleBase = 8, triangleHeight = 6;
        double circleRadius = 7;
        double cubeSide = 3;
        double prismLength = 12, prismWidth = 7, prismHeight = 5;
        double trapezoidBase1 = 9, trapezoidBase2 = 5, trapezoidHeight = 4;
        double sphereRadius = 6;

        System.out.println("Area of Square (side=" + squareSide + "): " + Geometry.areaOfSquare(squareSide));
        System.out.println("Area of Rectangle (length=" + rectangleLength + ", width=" + rectangleWidth + "): " + Geometry.areaOfRectangle(rectangleLength, rectangleWidth));
        System.out.println("Area of Triangle (base=" + triangleBase + ", height=" + triangleHeight + "): " + Geometry.areaOfTriangle(triangleBase, triangleHeight));
        System.out.println("Area of Circle (radius=" + circleRadius + "): " + Geometry.areaOfCircle(circleRadius));
        System.out.println("Volume of Cube (side=" + cubeSide + "): " + Geometry.volumeOfCube(cubeSide));
        System.out.println("Volume of Rectangular Prism (length=" + prismLength + ", width=" + prismWidth + ", height=" + prismHeight + "): " + Geometry.volumeOfRectangularPrism(prismLength, prismWidth, prismHeight));
        System.out.println("Area of Trapezoid (base1=" + trapezoidBase1 + ", base2=" + trapezoidBase2 + ", height=" + trapezoidHeight + "): " + Geometry.areaOfTrapezoid(trapezoidBase1, trapezoidBase2, trapezoidHeight));
        System.out.println("Volume of Sphere (radius=" + sphereRadius + "): " + Geometry.volumeOfSphere(sphereRadius));


        //4
        System.out.println("\n\n\n");
        System.out.println("4:");
        ProductManager.addProduct("Laptop", 1200.00);
        ProductManager.addProduct("Smartphone", 800.00);
        ProductManager.addProduct("Headphones", 150.00);
        ProductManager.listProducts();
        ProductManager.removeProduct("Smartphone");
        ProductManager.listProducts();

        //5
        System.out.println("\n\n\n");
        System.out.println("5:");
        BankAccount account1 = Bank.createAccount("Joao", 500.00);
        BankAccount account2 = Bank.createAccount("Beto", 1000.00);

        Bank.listAccounts();
        Bank.deposit(account1.getAccountNumber(), 200.00);
        Bank.withdraw(account2.getAccountNumber(), 150.00);
        Bank.transfer(account2.getAccountNumber(), account1.getAccountNumber(), 300.00);

        Bank.listAccounts();
        Bank.closeAccount(account1.getAccountNumber());
        Bank.listAccounts();

        //6
        System.out.println("\n\n\n");
        System.out.println("6:");

        Printable document = new Document();
        Printable image = new Image();
        document.print();
        image.print();

        //7
        System.out.println("\n\n\n");
        System.out.println("7:");
        Speakable dog = new Dog();
        Speakable cat = new Cat();
        dog.speak();
        cat.speak();

        //8
        System.out.println("\n\n\n");
        System.out.println("8:");
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {64, 34, 25, 12, 22, 11, 90};

        Sortable bubbleSort = new BubbleSort();
        Sortable quickSort = new QuickSort();

        System.out.println("Array original: " + Arrays.toString(array1));
        bubbleSort.sort(array1);
        System.out.println("BubbleSort: " + Arrays.toString(array1));
        quickSort.sort(array2);
        System.out.println("QuickSort: " + Arrays.toString(array2));

        //9
        System.out.println("\n\n\n");
        System.out.println("9:");
        CurrencyConverter usd = new usdToEurConverter();
        CurrencyConverter eur = new eurToUsdConverter();
        System.out.println("Usd converter: " + usd.convert(100,"usd","eur"));
        System.out.println("Eur converter: " + eur.convert(100,"usd","eur"));
    }
}