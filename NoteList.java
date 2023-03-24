public class NoteList { 
    int number, ram, hd, price;   // Задаем типы данных для полей класса
    String brand, colour, system;

    public NoteList(int number, String brand, int ram, int hd, String system, String colour, int price) {  //Создаем конструктор
        this.number = number;
        this.brand = brand;        
        this.ram = ram;
        this.hd = hd;
        this.system = system;
        this.colour = colour;
        this.price = price;
    }

    public static StringBuilder getHD(NoteList[] store, int hd) {  // Ф-ция получения данных HD
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {
            if (hd == el.hd) {  // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
                result.append("brand: "+ el.brand +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system + ", "+ "colour: " + el.colour + "\n");

            }
        }
        return result;
    }

    public static StringBuilder getRAM(NoteList[] store, int ram) {   // Ф-ция получения данных RAM
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {
            if (ram == el.ram) {   // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
                result.append("brand: "+ el.brand +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system + ", "+ "colour: " + el.colour + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getSystem(NoteList[] store, String system) {   // Ф-ция получения данных System OS
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {     // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (el.system.equalsIgnoreCase(system)) {         
                result.append("brand: "+ el.brand +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system +", " + "colour: "+ el.colour + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getColour(NoteList[] store, String colour) {  // Ф-ция получения данных по цветам
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {   // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (colour.equalsIgnoreCase(el.colour)) {
                result.append("brand: "+ el.brand +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system +", "+ "colour: " + el.colour + "\n");
            }
        }
        return result;
    }

    public static StringBuilder getBrand(NoteList[] store, String developer) {   // Ф-ция получения данных производителя
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {   // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
            if (developer.equalsIgnoreCase(el.brand)) {
                result.append("brand: "+ el.brand +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system +", "+ "colour: " + el.colour + "\n");
            }
        }
        return result;    
    }

    public static StringBuilder getPrice(NoteList[] store, int price) {  // Ф-ция получения данных price
        StringBuilder result = new StringBuilder();
        for (NoteList el : store) {
            if (price == el.price) {  // Сравнисаем введенные данные, если совпадают, добавляем все денные этого эл-та и возвращаем для вывода
                result.append("brand: "+ el.brand +", "+ "RAM: "+ el.ram +", "+"HD: "+ el.hd +", "+ "System: "+ el.system + ", "+ "colour: " + el.colour +  ", " + "price: " + el.price + "\n");

            }
        }
        return result;
    }

    @Override
    public String toString() {           // Переопределенная ф-ция toString вывода данных
        return String.format("number: %d, brand: %s, RAM: %d, HD: %d, System: %s, colour: %s", number, brand, ram, hd, system, colour, price);
    }

    public static char[] getPrice(NoteList[] store, String nextLine) {
        return null;
    }

}