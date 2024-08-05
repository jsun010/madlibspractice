import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Madlib madlib = new Madlib();
        String input1=scanner.nextLine();
        madlib.update1(input1);
        String input2=scanner.nextLine();
        madlib.update2(input2);
        String input3=scanner.nextLine();
        madlib.update3(input3);
        String input4=scanner.nextLine();
        madlib.update4(input4);

    }
}