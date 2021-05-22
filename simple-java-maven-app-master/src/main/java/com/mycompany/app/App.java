package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 */
public class App
{

    private final static String message= "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.err.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
