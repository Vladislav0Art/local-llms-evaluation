package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestData {

    @Test
    public void testData() {
        String data = "Hello, <script>alert('XSS')</script>";
        Element element = parser.parseString(data);
        assertTrue(element.getData().equals("Hello, <script>alert('XSS')</script>"));
    }

}