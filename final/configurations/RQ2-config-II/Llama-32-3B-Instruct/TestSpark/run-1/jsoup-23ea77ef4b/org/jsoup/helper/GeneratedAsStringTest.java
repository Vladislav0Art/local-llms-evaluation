package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        String expectedOutput = "Hello World!";
        Document doc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        assertEquals(expectedOutput, W3CDom.asString(doc));
    }

}