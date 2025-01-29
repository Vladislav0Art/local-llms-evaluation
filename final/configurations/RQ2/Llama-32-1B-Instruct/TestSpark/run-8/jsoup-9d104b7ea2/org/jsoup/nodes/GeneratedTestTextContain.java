package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextContain {

    @Test
    public void testTextContain() {
        TextNode node = new TextNode("Hello World");
        assertEquals(true, node.text().contains("World"));
    }

}