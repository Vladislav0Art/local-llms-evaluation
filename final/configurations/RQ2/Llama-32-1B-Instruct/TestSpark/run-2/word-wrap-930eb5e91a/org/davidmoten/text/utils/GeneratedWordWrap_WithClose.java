package org.davidmoten.text.utils;

import org.davidmoten.text.utils.Builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedWordWrap_WithClose {

    @Test
    public void wordWrap_WithClose() throws IOException {
        String text = "Hello World";
        assertEquals(text, wordWrap(new InputStreamReader(Builder.class.getResourceAsStream("test.txt")), System.out, 100,
                Function.identity(), null, false, true));
    }

}