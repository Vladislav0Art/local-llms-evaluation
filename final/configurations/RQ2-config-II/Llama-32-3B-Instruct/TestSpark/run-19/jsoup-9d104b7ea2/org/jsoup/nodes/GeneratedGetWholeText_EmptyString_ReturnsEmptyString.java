package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetWholeText_EmptyString_ReturnsEmptyString {

    @Test
    public void getWholeText_EmptyString_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}