package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlTail {

    public TextNode createNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void testOuterHtmlTail() {
        DocumentOutputSettings out = new DocumentOutputSettings(new StringBuilder(), true);
        TextNode node = createNode();
        node.outerHtmlTail(out);
        assertEquals("Hello World", (String) new StringBuilder().toString());
    }

}