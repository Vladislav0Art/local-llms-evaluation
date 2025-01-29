package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testHTML() {
        String html = "<html><body>Hello, World!</body></html>";
        assertEquals(5, html.length());
    }

    @Test
    public void testHTMLLength() {
        String html = "<p>This is a paragraph of text.</p>";
        assertEquals(12, html.length());
    }

    @Test
    public void testStringLength() {
        String s1 = "Hello";
        String s2 = "World!";
        assertEquals(s1.length(), 5);
        assertEquals(s2.length(), 6);
    }

    @Test
    public void testStringConcatenation() {
        String str1 = "Hello";
        String str2 = "World!";
        String str3 = "";
        System.out.println(str1 + str2 + str3); // prints: HelloWorld!
    }

}