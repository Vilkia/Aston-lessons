public class Park {

    // Внутренний класс Attraction
    public class Attraction {
        String name;
        String workingHours;
        double price;

        // Конструктор
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void displayInfo() {
            System.out.println("Название  аттракциона: " + name);
            System.out.println("Время работы : " + workingHours);
            System.out.println("Цена: " + price);
            System.out.println();
        }
    }
}


