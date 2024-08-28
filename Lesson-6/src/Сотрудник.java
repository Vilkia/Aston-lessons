public class Сотрудник {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    double salary;
    int age;

    // Конструктор
    public Сотрудник(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("емейл: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}
