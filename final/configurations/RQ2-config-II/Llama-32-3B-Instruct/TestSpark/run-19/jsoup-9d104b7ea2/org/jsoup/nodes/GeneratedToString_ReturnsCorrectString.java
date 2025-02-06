package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedToString_ReturnsCorrectString {

    @Test
    public void toString_ReturnsCorrectString() {
        TextNode node = new TextNode("Hello World");
        String result = node.toString();
        assertEquals("text-node: Hello World", result);
    }

}