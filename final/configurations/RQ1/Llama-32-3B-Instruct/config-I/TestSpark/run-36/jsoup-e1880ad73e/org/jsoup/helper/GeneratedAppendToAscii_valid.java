package org.jsoup.helper;

public class GeneratedAppendToAscii_valid {

    @Test
    public void appendToAscii_valid() {
        String s = "Hello World";
        StringBuilder result = new StringBuilder();
        UrlBuilder.appendToAscii(s, true, result);
        assertEquals("Hello+World", result.toString());
    }

}