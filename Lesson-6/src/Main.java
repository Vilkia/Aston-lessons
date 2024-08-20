public class Main {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Сотрудник[] employees = new Сотрудник[5];

        // Заполняем массив объектами
        employees[0] = new Сотрудник("Ivan Ivanov", "Engineer", "ivanov@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Сотрудник("Petr Petrov", "Manager", "petrov@mailbox.com", "892345678", 35000, 28);
        employees[2] = new Сотрудник("Sidor Sidorov", "Developer", "sidorov@mailbox.com", "892376543", 45000, 32);
        employees[3] = new Сотрудник("Kuzma Kuznetsov", "Analyst", "kuznetsov@mailbox.com", "892398765", 40000, 29);
        employees[4] = new Сотрудник("Vasily Vasiliev", "Director", "vasiliev@mailbox.com", "892312398", 50000, 45);

        // Выводим информацию о каждом сотруднике
        for (Сотрудник employee : employees) {
            employee.displayInfo();
        }
    }
}