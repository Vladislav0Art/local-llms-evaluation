package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTextValuesWithNullValue {

    @Test
    public void testTextValuesWithNullValue() {
        assertFalse(new TextNode(null).text().isEmpty());
        assertTrue(new TextNode(null).text() == "");
    }

}