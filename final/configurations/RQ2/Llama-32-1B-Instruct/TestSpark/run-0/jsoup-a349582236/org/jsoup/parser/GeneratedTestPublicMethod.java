package org.jsoup.parser;

public class GeneratedTestPublicMethod {

    public String publicMethod(String input) {
        return input + " World!";
    }

    @Test
    public void testPublicMethod() {
        assertEquals("World!", publicMethod("Hello, "));
    }
}

public class PublicClass2 {
    public String getPublicString(String input) {
        return input + " World!";
    }

    public String setPublicString(String input, String newInput) {
        if (newInput != null && !newInput.isEmpty()) {
            return input + " " + newInput;
        } else {
            throw new IllegalArgumentException("New string cannot be empty");
        }
    }

}