import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 8;
        int y = 10;

        while (true) {
            System.out.println("[Программа] Марсоход находится на позиции:" + x + ", " + y + " введите команду:");

            System.out.print("[Оператор]: ");

            String command = scanner.nextLine();

            if (command.equals("W")) {
                if (y + 1 <= 20) {
                    y += 1;
                } else {
                    System.out.println("[Программа] Достигнута граница участка!");
                }
            } else if (command.equals("S")) {
                if (y - 1 >= 0) {
                    y -= 1;
                } else {
                    System.out.println("[Программа] Достигнута граница участка!");
                }
            } else if (command.equals("A")) {
                if (x - 1 >= 0) {
                    x -= 1;
                } else {
                    System.out.println("[Программа] Достигнута граница участка!");
                }
            } else if (command.equals("D")) {
                if (x + 1 <= 15) {
                    x += 1;
                } else {
                    System.out.println("[Программа] Достигнута граница участка!");
                }
            } else {
                System.out.println("[Программа] Неверная команда.");
            }
        }
    }
}
