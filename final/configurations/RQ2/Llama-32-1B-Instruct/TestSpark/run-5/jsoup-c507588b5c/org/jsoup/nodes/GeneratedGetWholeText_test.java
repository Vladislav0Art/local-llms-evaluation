package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedGetWholeText_test {

    @Test
    public void getWholeText_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

}