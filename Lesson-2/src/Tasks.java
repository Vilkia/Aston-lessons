import java.util.Arrays;

public class Tasks {
    //Задание 1: Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 2: Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
    // любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или
    // равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSumSign() {
        int a = 5;
        int b = 11;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    //Задание 3: Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым
    // значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если
    // лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100
    // (100 исключительно) - “Зеленый”;
    public static void printColor() {
        int value = 70;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //Задание 4: Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте
    // их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение
    // “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
        int a = 15;
        int b = 7;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    //Задание 5: Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     public  static void checkSum(int a, int b) {
      boolean c = a + b >= 10 & a + b <= 20 ? true : false;
      System.out.println(c);
    }

    //Задание 6: Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в
    // консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void checkNumb(int a){
        if (a>=0){
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }

    //Задание 7: Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.
    //Замечание: ноль считаем положительным числом.
    public static void checkNum(int a){
        boolean b = a < 0;
        System.out.println(b);
    }

    //Задание 8: Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в
    // консоль указанную строку, указанное количество раз;
    public static void printString(String message, int a){
        for (int i=0; i<a; i++ ){
            System.out.print(message+ " ");
        }
        System.out.println(" ");
    }

    //Задание 9: Напишите метод, который определяет, является ли год високосным, и возвращает boolean
    // (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный.
    public static boolean checkYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        else{
            return false;
        }

    }

    //Задание 11:Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void Array() {
        int[] array = {1, 0, 0, 1, 0, 0, 1, 0, 0, 1};
        System.out.print("Изначальный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        System.out.print("Измененный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
    //Задание 11: Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    // значениями 1 2 3 4 5 6 7 8 ... 100;
    public static void Array100() {
        int[] array = new int[100];
        System.out.print("Изначальный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.print("Измененный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }

    //Задание 12:Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void ArrayIncr() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Изначальный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.print("Измененный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
    //Задание 13: Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
    public static void ArrayDig() {
        int n = 5;
        int[][] array = new int[n][n];
        System.out.println("Изначальный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - 1 - i] = 1;
        }
        System.out.println("Измененный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 14: Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
    // массив типа int длиной len, каждая ячейка которого равна initialValue.
    public static void ArrayCreate(int len, int initialValue) {
        int[] result = createArray(len, initialValue);
        System.out.print("Сгенерированный массив: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }






}


