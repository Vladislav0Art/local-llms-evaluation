package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlHead {

    public TextNode createNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void testOuterHtmlHead() {
        DocumentOutputSettings out = new DocumentOutputSettings(new StringBuilder(), true);
        TextNode node = createNode();
        node.outerHtmlHead(out);
        assertEquals("Hello World", (String) new StringBuilder().toString());
    }

}