import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner toolBox = new Scanner(System.in);

        // массив пользовательской корзины
        List<String> list = new LinkedList<>();

        // Цикл ввода данных пользователем для наполнения корзины
        while (true) {
            System.out.println("Выберите операцию: ");
            System.out.println("1 - Операция добавить");
            System.out.println("2 - Операция показать");
            System.out.println("3 - Операция удалить");
            System.out.println("Введите `end` для выхода");
            String shop = toolBox.nextLine();
            //Завершение ввода данных и вывод корзины
            if ("end".equals(shop)) {
                return;

            }
            //Операция добавления
            if ("1".equals(shop)) {
                System.out.println("Какую покупку хотите добавить?");
                String add = toolBox.nextLine();
                list.add(add);
                System.out.println("Итого в списке покупок: " + list.size());
            }
            //Операция показ
            if ("2".equals(shop)) {
                System.out.println("Список покупок:");
                for (String s : list) {
                    int index = list.indexOf(s) + 1;
                    System.out.println(index + ". " + s);
                }
            }
            //Операция удаления
            if ("3".equals(shop)) {
                System.out.println("Список покупок:");
                for (String s : list) {
                    int index = list.indexOf(s) + 1;
                    System.out.println(index + ". " + s);
                }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                   // Проверка ведено число или строка
                    if (toolBox.hasNextInt()) {
                        int i = toolBox.nextInt();
                        String del = list.get(i-1);
                        list.remove(i-1);
                        System.out.println("Покупка " + del + " удалена, список покупок:");
                        for (String s : list) {
                            int index = list.indexOf(s) + 1;
                            System.out.println(index + ". " + s);
                        }
                    }else {String delete = toolBox.nextLine();
                        list.remove(delete);
                        System.out.println("Покупка " + delete + " удалена, список покупок:");
                        for (String s : list) {
                            int index = list.indexOf(s) + 1;
                            System.out.println(index + ". " + s);
                        }
                    }
                }
            }
        }
    }


