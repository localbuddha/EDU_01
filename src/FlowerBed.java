import java.util.Scanner;

/*
Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
from the console, and output obtained results.
 */

public class FlowerBed {

    // Опис метода для обчислення периметру. L=2*PI*r
    public static double perimeter(double flowerBedRadius) {
        return Math.PI * 2 * flowerBedRadius;
    }

    // Опис метода для обчислення площі. S=PI*r*r
    public static double area(double flowerBedRadius) {
        return Math.PI * flowerBedRadius * flowerBedRadius;
    }

    public static void main(String[] args) {
        double flowerBedRadius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас вітає \"штучний інтелект\".");
        System.out.println("Я можу допомогти вам з обчисленням периметру та площі ліжка.");
        System.out.println("Для цього мені потрібно знати радіус цього ліжка, тому введіть його у метрах:");

        // Тут юзер додає радіус.
        flowerBedRadius = scanner.nextDouble();

        System.out.println("Мої вітання! ШІ підрахував периметр та площу ліжка.");
        //Тут використовується форматування строк таким чином, щоб число double виводилося з двома знаками після коми.
        System.out.printf("Периметр ліжка = %.2f", perimeter(flowerBedRadius));
        System.out.println("m");
        System.out.printf("Площа ліжка = %.2f", area(flowerBedRadius));
        System.out.println("m\u00b2");

        /*
        Звісно, все це можна було підрахувати одразу в параметрах метода print, використовуючи конкатенацію,
        і виглядало б це таким чином, як у двох закомментованих рядках нижче:
        */
        //System.out.println("Периметр ліжка = " + (Math.PI * 2 * flowerBedRadius));
        //System.out.println("Площа ліжка = " + (Math.PI * flowerBedRadius * flowerBedRadius));

        //Але мені здається, що primary рішення виглядає більш елегантним.
        scanner.close();
    }
}