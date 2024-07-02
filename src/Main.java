import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("\n\n\n");
        System.out.println("1:");

        //2
        System.out.println("\n\n\n");
        System.out.println("2:");

        //3
        System.out.println("\n\n\n");
        System.out.println("3:");

        //4
        System.out.println("\n\n\n");
        System.out.println("4:");

        //5
        System.out.println("\n\n\n");
        System.out.println("5:");

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