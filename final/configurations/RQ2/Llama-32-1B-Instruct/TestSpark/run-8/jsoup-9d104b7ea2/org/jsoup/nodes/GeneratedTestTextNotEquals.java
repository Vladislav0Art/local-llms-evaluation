package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNotEquals {

    @Test
    public void testTextNotEquals() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = new TextNode("Hello Universe");
        assertEquals(node1, node2);
        assertEquals(0L, node1.text().length(), 10); // Assuming the length of "Hello World" is 11
    }

}