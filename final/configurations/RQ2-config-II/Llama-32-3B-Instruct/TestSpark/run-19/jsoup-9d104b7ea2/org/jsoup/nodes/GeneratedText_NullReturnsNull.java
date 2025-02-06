package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedText_NullReturnsNull {

    @Test
    public void text_NullReturnsNull() {
        TextNode node = new TextNode(null);
        assertEquals(null, node.text());
    }

}