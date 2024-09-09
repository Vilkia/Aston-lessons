package org.example;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phoneBook;
    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }
    public void add(String surname, String phoneNumber) {
        if (surname == null || surname.isEmpty() || phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Фамилия и номер телефона не могут быть пустыми");
        }
        phoneBook.putIfAbsent(surname, new ArrayList<>());
        phoneBook.get(surname).add(phoneNumber);
    }


    public List<String> get(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой");
        }

        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Maliuk", "123-456");
        phoneBook.add("Kovalev", "987-654");
        phoneBook.add("Papruga", "555-555");
        phoneBook.add("Maliuk", "111-222");

        System.out.println("Телефоны Maliuk: " + phoneBook.get("Maliuk"));
        System.out.println("Телефоны Kovalev: " + phoneBook.get("Kovalev"));
        System.out.println("Телефоны Papruga: " + phoneBook.get("Papruga"));
        System.out.println("Телефоны Zmushko: " + phoneBook.get("Zmushko"));
    }
}
