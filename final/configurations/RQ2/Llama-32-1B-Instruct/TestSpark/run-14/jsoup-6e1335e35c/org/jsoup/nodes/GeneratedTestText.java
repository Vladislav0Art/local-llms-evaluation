package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestText {

    private Document document = new Document();

    @Test
    public void testText() {
        assertEquals("Hello, World!", document.text("Hello, World!"));
    }

}