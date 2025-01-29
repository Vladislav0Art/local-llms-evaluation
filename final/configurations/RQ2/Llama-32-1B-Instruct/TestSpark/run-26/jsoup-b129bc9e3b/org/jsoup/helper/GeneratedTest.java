package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testMethod1() {
        int statusCode = 200;
        String body = "Hello World";
        assertEquals(statusCode, Main.getstatusCode(body));
    }

    @Test
    public void testMethod2() {
        int statusCode = 404;
        String body = "Not Found";
        assertEquals(statusCode, Main.getstatusCode(body));
    }

    @Test
    public void testMethod3() {
        int statusCode = 200;
        String body = "OK";
        assertEquals(statusCode, Main.getstatusCode(body));
    }

    @Test
    public void testMethod4() {
        int statusCode = 500;
        String body = "Internal Server Error";
        assertEquals(statusCode, Main.getstatusCode(body));
    }

}