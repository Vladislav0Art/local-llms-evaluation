package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTestPublicMethod_EmptyString {

    public String publicMethod(String input) {
        return input + " World!";
    }

    @Test
    public void testPublicMethod_EmptyString() {
        assertEquals("", publicMethod(""));
    }
}

public class PublicClass2 {
    public String getPublicString(String input) {
        return input + " World!";
    }

    public String setPublicString(String input, String newInput) {
        return input + " " + newInput;
    }

}