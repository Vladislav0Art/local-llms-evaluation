package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder("Hello");
        assertEquals(true, lastCharIsWhitespace(sb));
    }

}