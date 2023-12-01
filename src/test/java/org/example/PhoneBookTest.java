package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void testAdd() {
        int result = phoneBook.add("Вася", "89221234567");
        assertEquals(1, result);
    }

    @Test
    void findByNumber() {
        phoneBook.add("Вася", "1");
        String result = phoneBook.findByNumber("1");
        assertEquals("Вася", result);
    }
}