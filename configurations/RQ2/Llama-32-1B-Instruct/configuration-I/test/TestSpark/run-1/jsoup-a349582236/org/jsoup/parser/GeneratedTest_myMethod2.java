package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTest_myMethod2 {

    @Test
    public void test_myMethod2() {
        int i = 10;
        int j = 20;
        System.out.println(MyObject.myMethod2(i, j));
    }
}

class MyObject {

    public static String attribute;

    public static String attribute2;

    public String myMethod1(String s) {
        return "myMethod1" + s;
    }

    public int myMethod2(int i, int j) {
        return i + j;
    }

}