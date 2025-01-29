package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextEquals {

    @Test
    public void testTextEquals() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = new TextNode("Hello World");
        assertEquals(node1, node2);
        assertEquals(0L, node1.text().length(), 10); // Assuming the length of "Hello World" is 11
    }

}