import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //перевод из дюймов в метры
       /*Scanner scanner = new Scanner(System.in);
       System.out.print("Введите число в дюймах: ");
       double inches = scanner.nextDouble();
       double meters = inches * 0.0254;
       System.out.println(meters);*/

        //среднее арифметическое 3 чисел
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();
        double sred = sredAref(num1, num2, num3);
        System.out.println(sred);
        }
    public static double sredAref(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;*/

        //преобразование заданного числа в строковый формат
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        String str = Integer.toString(num);
        System.out.println("Число в строковом формате: " + str);*/

        //экземпляры для класса Person
        /*Person person1 = new Person ("Мария", 18, "Женский");
        Person person2 = new Person ("Владимир", 27, "Мужской");
        System.out.println("Имя: " + person1.getName() + ", Возраст: " + person1.getAge() + ", Пол: " + person1.getGender());
        System.out.println("Имя: " + person2.getName() + ", Возраст: " + person2.getAge() + ", Пол: " + person2.getGender());*/

        //экземпляры класса Animals
        Animals tiger = new Tiger("Лёва", 1 );
        Animals shark = new Shark("Акуленок", 150 );
        Animals bird = new Bird ("Синичка", 2 );

        tiger.Sound();
        tiger.Move();
        tiger.eat();
        tiger.Hishnikys();
        shark.Sound();
        shark.Move();
        shark.eat();
        bird.Sound();
        bird.Move();
        bird.eat();
    }
    }