import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Scanner scanner = new Scanner(System.in);
        boolean choice = true;
        while (choice) {
            System.out.println("Введите команду: (add, raffle, exit)");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("Введите id игрушки: ");
                    String idString = scanner.nextLine();
                    int id = Integer.parseInt(idString);
                    System.out.println("Введите имя игрушки: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите шанс получения игрушки: ");
                    String chanceString = scanner.nextLine();
                    int chance = Integer.parseInt(chanceString);
                    lottery.add(id, chance, name);
                    break;
                case "raffle":
                    lottery.raffle();
                    break;
                case "exit":
                    choice = false;
                    break;
                default:
                    System.out.println("Введена неправильная команда!");
                    break;
            }
        }
    }
}
