package com.example.pl_zajecia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DodawanieApplicationTest {

    @Test
    void added() {
        Application application=new Application();
        assertEquals(10,application.added(5,5));
    }
}