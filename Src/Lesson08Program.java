import java.util.Scanner;

public class Lesson08Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menuCalculator();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter first number: ");
                    int a = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    int b = scanner.nextInt();
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println("Enter first number: ");
                    int a1 = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    int b1 = scanner.nextInt();
                    System.out.println(a1 - b1);
                    break;
                case 3:
                    System.out.println("Enter first number: ");
                    int a2 = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    int b2 = scanner.nextInt();
                    System.out.println(a2 * b2);
                    break;
                case 4:
                    System.out.println("Enter first number: ");
                    int a3 = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    int b3 = scanner.nextInt();
                    if (b3 != 0) {
                        System.out.println(a3 / b3);
                    }
                    else {
                        System.out.println("Can`t divide by zero");
                    }
                    break;
                case 5:
                    return;
            }
        }

//        Person bob = new Person("Bob", 24, "Java developer", true);
//
//        System.out.println(bob);

//        Person tom = new Person();
//        tom.name = "Tom";
//        tom.sex = true;
//        tom.age = 25;
//        tom.profession = "Java developer";
//
//        System.out.println(tom);

//        Object objectProgram = new Object();
//        String str1Name = objectProgram.getClass().getName();
//        System.out.println(str1Name);
//        System.out.println(objectProgram);
//
//        Person person = new Person();
//        String str2Name= person.getClass().getName();
//        System.out.println(str2Name);
    }

    public static void menuCalculator() {
        System.out.println("Please choose choice: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }

}

