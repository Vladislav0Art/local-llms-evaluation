package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestToStringWithNullValueAndEmptyText {

    @Test
    public void testToStringWithNullValueAndEmptyText() {
        assertEquals(null, new TextNode("").toString());
        assertEquals(null, new TextNode(new String[]{}).toString());
    }

}