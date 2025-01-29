package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestMethod2 {

    @Test
    public void testMethod2() {
        int statusCode = 404;
        String body = "Not Found";
        assertEquals(statusCode, Main.getstatusCode(body));
    }

}