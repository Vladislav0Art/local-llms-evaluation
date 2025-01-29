package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOwnText {

    private Document document = new Document();

    @Test
    public void testOwnText() {
        assertTrue(document.ownText().contains("World"));
        assertFalse(document.ownText().contains("Hello"));
    }

}