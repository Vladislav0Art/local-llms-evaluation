package org.jsoup.parser;

public class GeneratedTestGetPublicString {

    public String publicMethod(String input) {
        return input + " World!";
    }

    @Test
    public void testGetPublicString() {
        assertEquals("World!", getPublicString(""));
    }

}