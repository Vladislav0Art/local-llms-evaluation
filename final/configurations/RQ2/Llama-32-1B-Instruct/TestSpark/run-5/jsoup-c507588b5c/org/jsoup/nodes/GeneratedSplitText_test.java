package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSplitText_test {

    @Test
    public void splitText_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals(1, node.splitText(0));
        assertEquals("Hello", node.splitText(1).text());
    }

}