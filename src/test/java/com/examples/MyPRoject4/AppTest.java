package com.examples.MyPRoject4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.examples.MyPRoject4.App;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    //private final Day0 unit4 = new Day0();


    @Test
    public void testHelloWorld() {
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(null);

        String expectedOutput = "hello world";
        String input = outContent.toString().toLowerCase();
        if(input.indexOf(expectedOutput) != -1) {
        	input = "hello world";
        }

        assertEquals(expectedOutput,input);

    }
    @Test
    public void testBirthday() {
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(null);

        String expectedOutput = "birthday";
        String input = outContent.toString().toLowerCase();
        if(input.indexOf(expectedOutput) != -1) {
        	input = "birthday";
        }

        assertEquals(expectedOutput,input);
    }
    @Test
    public void testPrint10() {
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(null);

        String expectedOutput = "10";
        String input = outContent.toString().toLowerCase();
        if(input.indexOf(expectedOutput) != -1) {
        	input = "10";
        }

        assertEquals(expectedOutput,input);
    }
    

}

