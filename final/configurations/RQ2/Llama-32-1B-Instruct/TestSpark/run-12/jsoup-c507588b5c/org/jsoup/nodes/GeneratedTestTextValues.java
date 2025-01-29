package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTextValues {

    @Test
    public void testTextValues() {
        assertTrue(new TextNode().text() != null);
        assertFalse(new TextNode().text().isEmpty());
        assertFalse(new TextNode().text().equals(""));
    }

}