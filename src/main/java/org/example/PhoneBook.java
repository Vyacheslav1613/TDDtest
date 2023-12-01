package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class PhoneBook {
    public HashMap<String, String> phoneBook = new HashMap<>();
    public int add(String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        }
            return phoneBook.size();
    }
    public String findByNumber(String number){
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public String findByName(String name){
        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }
        return null;
    }
    public void printAllNames() {
        TreeSet<String> sortedNames = new TreeSet<>(phoneBook.keySet());
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }

}