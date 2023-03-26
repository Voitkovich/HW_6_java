
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
    public static void main(String[] args) throws Exception { // Создаем массив с типом NoteList

        NoteList Notebook_1 = new NoteList(1, "ASUS", 4, 256, "Linux", "BLUE", 44000);
        NoteList Notebook_2 = new NoteList(2, "ASUS", 16, 512, "Windows10", "GRAY", 44000);
        NoteList Notebook_3 = new NoteList(3, "HD", 16, 1000, "Linyx", "BLACK", 55000);
        NoteList Notebook_4 = new NoteList(4, "MAC", 8, 256, "MacOS", "WHITE", 25000);
        NoteList Notebook_5 = new NoteList(5, "ASER", 4, 128, "Windows11", "BLACK", 33000);
        NoteList[] store = new NoteList[] { Notebook_1, Notebook_2, Notebook_3, Notebook_4, Notebook_5 }; 
                                                                                                          
        // Принимаем выбор пользователя
        int scaner = input.Int(
                "Меню: \n1 - Показать весь список ноутбуков\n2 - Размер накопителя\n3 - Размер оперативной памяти\n4 - Операционная система \n5 - Цвет\n6 - Торговая марка\n7 - Цена\n");

        switch (scaner) {
            case 1: // Вывод перечня всех ноутбуков
                System.out.println("Список ноутбуков: ");
                System.out.println(Notebook_1.toString());
                System.out.println(Notebook_2.toString());
                System.out.println(Notebook_3.toString());
                System.out.println(Notebook_4.toString());
                System.out.println(Notebook_5.toString());
                break;
            case 2: // Вывод данных вариантов объёма HD
                int hd = input.Int("Выберете размер накопителя: 256 Гб, 128 Гб, 512 Гб, 1000 Гб");
                System.out.println(NoteList.getHD(store, hd));
                break;
            case 3: // Вывод данных вариантов объёма RAM
                int ram = input.Int("Выберете размер оперативной памяти: 4 Гб, 8 Гб, 16 Гб");
                System.out.println(NoteList.getRAM(store, ram));
                break;
            case 4: // Вывод данных вариантов OS
                String sc2 = input.Str("Введите Операционную систему: Linux, Windows10, MacOS, Windows11");
                System.out.println(NoteList.getSystem(store, sc2));
                break;
            case 5: // Вывод данных вариантов цвета
                String sc3 = input.Str("Введите цвет: BLUE, GRAY, BLACK, WHITE");
                System.out.println(NoteList.getColour(store, sc3));
                break;
            case 6: // Вывод данных вариантов производителя
                String sc1 = input.Str("Выберете торговую марку производителя: ASUS, HD, MAC, ASER");
                System.out.println(NoteList.getBrand(store, sc1));
                break;
            case 7: // Вывод данных вариантов цены
                int price = input.Int("Выберете подходящую цену: 44000, 55000, 25000, 33000");
                System.out.println(NoteList.getPrice(store, price));
                break;
            default: // Сообщение в случае неверного ввода
                System.out.println("Выберите пункт из списка  1 - 7");
        }
    }
}