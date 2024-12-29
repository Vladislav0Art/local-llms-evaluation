package org.jsoup.parser;

public class GeneratedTestSetPublicString {

    public String publicMethod(String input) {
        return input + " World!";
    }

    @Test
    public void testSetPublicString() {
        try {
            assertEquals("", setPublicString(""));
        } catch (IllegalArgumentException e) {
            assertEquals("New string cannot be empty", e.getMessage());
        }
    }

}