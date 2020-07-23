package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @BeforeAll
    public static void beforeClass(){
        System.out.println("Executed only once before all tests, TESTS ARE RUNNING");
    }


    @AfterAll
    public static void afterClass(){
        System.out.println("TESTS ARE DONE");
    }


    @BeforeEach
    public void init(){

    }

    @AfterEach
    public void afterTest(){
        System.out.println("Test was done");
    }

    @Test
    public void isAnagramTest () {
        assertEquals(Main.isAnagram("karamel", "reklama"), true);
    }

}