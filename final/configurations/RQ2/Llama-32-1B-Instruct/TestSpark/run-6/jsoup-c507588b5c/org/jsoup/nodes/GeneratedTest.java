package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testNormaliseWhitespace() {
        String str = "Hello World";
        String result = normaliseWhitespace(str);
        System.out.println(result); // Expected output: Hello World
    }

    @Test
    public void testStripLeadingWhitespace() {
        String str = "   ";
        String result = stripLeadingWhitespace(str);
        System.out.println(result); // Expected output:
    }

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb1 = new StringBuilder("Hello World");
        String str1 = lastCharIsWhitespace(sb1);
        System.out.println(str1.equals("\n\r\n")); // Expected output: false
        String sb2 = new StringBuilder("   ");
        String str2 = lastCharIsWhitespace(sb2);
        System.out.println(str2.equals("\n\r\n")); // Expected output: true
    }

    @Test
    public void testNormaliseWhitespaceWithMultipleSpaces() {
        String str1 = "Hello   World";
        String result1 = normaliseWhitespace(str1);
        System.out.println(result1); // Expected output: Hello World
    }

    @Test
    public void testNormaliseWhitespaceWithLeadingSpaces() {
        String str2 = "   ";
        String result2 = normaliseWhitespace(str2);
        System.out.println(result2); // Expected output:
    }

    @Test
    public void testStripLeadingWhitespaceWithMultipleSpaces() {
        String str3 = "   Hello World";
        String result3 = stripLeadingWhitespace(str3);
        System.out.println(result3); // Expected output: Hello World
    }

    @Test
    public void testStripLeadingWhitespaceWithLeadingSpaces() {
        String str4 = "Hello ";
        String result4 = stripLeadingWhitespace(str4);
        System.out.println(result4.equals("")); // Expected output: true
    }

}