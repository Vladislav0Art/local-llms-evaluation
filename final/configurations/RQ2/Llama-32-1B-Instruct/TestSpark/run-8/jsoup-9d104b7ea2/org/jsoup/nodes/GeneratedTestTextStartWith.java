package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextStartWith {

    @Test
    public void testTextStartWith() {
        TextNode node = new TextNode("Hello ");
        assertEquals(true, node.text().startsWith("Hello "));
    }

}