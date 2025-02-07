package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetWholeText {

    private TextNode rootNode;

    @Test
    public void testGetWholeText() {
        rootNode = new TextNode("Hello World");
        assertEquals("Hello World", rootNode.getText());
    }

}