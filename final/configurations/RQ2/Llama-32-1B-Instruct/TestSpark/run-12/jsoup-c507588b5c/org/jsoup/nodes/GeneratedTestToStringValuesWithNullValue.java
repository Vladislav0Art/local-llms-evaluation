package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestToStringValuesWithNullValue {

    @Test
    public void testToStringValuesWithNullValue() {
        assertEquals("TEXT_NODE", new TextNode(null).toString());
        assertEquals("TEXT_NODE", new TextNode(new String[]{}).toString());
    }

}