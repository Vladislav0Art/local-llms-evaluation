package org.davidmoten.text.utils;

import org.davidmoten.text.utils.Builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedWordWrap_WithWhitespace {

    @Test
    public void wordWrap_WithWhitespace() throws IOException {
        assertEquals("Hello \nWorld", wordWrap(new InputStreamReader(Builder.class.getResourceAsStream("test.txt")), System.out, 100,
                Function.identity(), null, false, true));
    }

}