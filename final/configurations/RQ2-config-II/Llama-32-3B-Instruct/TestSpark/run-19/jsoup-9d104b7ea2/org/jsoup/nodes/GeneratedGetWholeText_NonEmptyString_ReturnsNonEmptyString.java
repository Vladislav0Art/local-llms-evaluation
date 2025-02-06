package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetWholeText_NonEmptyString_ReturnsNonEmptyString {

    @Test
    public void getWholeText_NonEmptyString_ReturnsNonEmptyString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

}