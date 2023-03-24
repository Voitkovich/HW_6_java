import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class Notebook { // Создаем класс
    public static void main(String[] args) throws Exception { // Создаем массв с типом NoteList

        NoteList Notebook_1 = new NoteList(1, "ASUS", 4, 256, "Linux", "BLUE", 44000);
        NoteList Notebook_2 = new NoteList(2, "ASUS", 16, 512, "Windows10", "GRAY", 44000);
        NoteList Notebook_3 = new NoteList(3, "HD", 16, 1000, "Linyx", "BLACK", 55000);
        NoteList Notebook_4 = new NoteList(4, "MSI", 8, 256, "Windows11", "WHITE", 25000);
        NoteList Notebook_5 = new NoteList(5, "ASER", 4, 128, "DOS", "BLACK", 33000);
        NoteList[] store = new NoteList[] { Notebook_1, Notebook_2, Notebook_3, Notebook_4, Notebook_5 }; // Заполняем
                                                                                                          // массив
        System.out.println(
                "Выберете характеристику для помиска: \n1 - Показать весь список ноутбуков\n2 - Размер накопителя\n3 - Размер оперативной памяти\n4 - Операционная система \n5 - Цвет\n6 - Торговая марка\n7 - Цена\n");

        Scanner sc = new Scanner(System.in);
        int scaner = sc.nextInt(); // Принимаем выбор пользователя

        switch (scaner) {
            case 1: // Вывод перечня всех ноутбуков по присвоенному номеру
                System.out.println("Список ноутбуков: ");
                System.out.println(Notebook_1.toString());
                System.out.println(Notebook_2.toString());
                System.out.println(Notebook_3.toString());
                System.out.println(Notebook_4.toString());
                System.out.println(Notebook_5.toString());
                break;
            case 2: // Вывод данных вариантов объёма HD, при вводе параметрв вызывает свой метод и
                    // выодит перечень ноутбуков
                System.out.println("Выберете размер накопителя: 256 Гб, 128 Гб, 512 Гб, 1000 Гб");
                int hd = sc.nextInt();
                System.out.println(NoteList.getHD(store, hd));
                break;
            case 3: // Вывод данных вариантов объёма RAM, при вводе параметрв вызывает свой метод и
                    // выодит перечень ноутбуков
                System.out.println("Выберете размер оперативной памяти: 4 Гб, 8 Гб, 16 Гб");
                int ram = sc.nextInt();
                System.out.println(NoteList.getRAM(store, ram));
                break;
            case 4: // Вывод данных вариантов OS, при вводе параметрв без учета регистра, вызывает
                    // свой метод и выодит перечень ноутбуков
                System.out.println("Введите Операционную систему: Linux, Windows10, Windows11, DOS");
                Scanner sc2 = new Scanner(System.in);
                System.out.println(NoteList.getSystem(store, sc2.nextLine()));
                break;
            case 5: // Вывод данных вариантов цвета, при вводе параметрв без учета регистра,
                    // вызывает свой метод и выодит перечень ноутбуков
                System.out.println("Введите цвет: BLUE, GRAY, BLACK, WHITE");
                Scanner sc3 = new Scanner(System.in);
                System.out.println(NoteList.getColour(store, sc3.nextLine()));
                break;
            case 6: // Вывод данных вариантов производителя, при вводе параметрв без учета регистра,
                    // вызывает свой метод и выодит перечень ноутбуков
                System.out.println("Выберете торговую марку производителя: ASUS, HD, MSI, ASER");
                Scanner sc1 = new Scanner(System.in);
                System.out.println(NoteList.getBrand(store, sc1.nextLine()));
                break;
            case 7: // Вывод данных вариантов цены, при вводе параметрв без учета регистра,
                    // вызывает свой метод и выодит перечень ноутбуков
                System.out.println("Выберете подходящую цену: 44000, 55000, 25000, 33000");
                int price = sc.nextInt();
                System.out.println(NoteList.getPrice(store, price));
                break;
            default: // В случаен неверного ввода выводит сообщение
                System.out.println("Выберите пункт из списка  1 - 7");
        }
        sc.close();
    }
}