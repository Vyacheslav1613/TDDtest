package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void testAdd() {
        int result = phoneBook.add();
        assertEquals(0, result);
    }

    @Test
    void findByNumber() {
        String result = phoneBook.findByNumber();
        assertEquals("Hi", result);
    }
}