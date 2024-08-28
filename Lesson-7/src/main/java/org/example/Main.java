package org.example;
class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected static int animalCount = 0;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull = false;
    private static final int FOOD_PER_MEAL = 5; // Количество еды за одно кормление

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean eat(Bowl bowl) {
        if (!isFull && bowl.getFoodAmount() >= FOOD_PER_MEAL) {
            if (bowl.decreaseFood(FOOD_PER_MEAL)) {
                isFull = true;
                System.out.println(name + " поел " + FOOD_PER_MEAL + " единиц еды и теперь сыт.");
                return true;
            }
        } else {
            System.out.println(name + " не может поесть, в миске недостаточно еды.");
            return false;
        }
        return false;
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0); // Защита от отрицательного количества еды
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавили " + amount + " единиц еды. Теперь в миске " + foodAmount + " единиц еды.");
        }
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurka = new Cat("Мурка");

        dogBobik.run(150);
        dogBobik.swim(5);

        catMurka.run(100);
        catMurka.swim(5);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        // Создание массива котов и миски
        Cat[] cats = {
                new Cat("Мурка"),
                new Cat("Барсик"),
                new Cat("Рыжик")
        };
        Bowl bowl = new Bowl(5);  // В миске 15 единиц еды (достаточно для 3 кормлений)

        // Попробуем накормить всех котов
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        // Выводим информацию о сытости котов
        System.out.println("\nСостояние котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + (cat.isFull() ? " сыт" : " голоден"));
        }

        // Добавление еды в миску и повторная попытка накормить котов
        bowl.addFood(5);
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl);
            }
        }

        // Выводим информацию о сытости котов после добавления еды
        System.out.println("\nСостояние котов после добавления еды:");
        for (Cat cat : cats) {
            System.out.println(cat.name + (cat.isFull() ? " сыт" : " голоден"));
        }
    }
}
