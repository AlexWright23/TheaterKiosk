import java.util.Scanner;

//Class age
//        main()
//        num = age
//        output "Please enter your age "
//        input age
//        if age >= 21 then
//        output "Here is your wrist band"
//        return
//        endClass
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 21) {
            System.out.println("Congratulations! You get a wristband!");
        }
        scanner.close();
    }
}