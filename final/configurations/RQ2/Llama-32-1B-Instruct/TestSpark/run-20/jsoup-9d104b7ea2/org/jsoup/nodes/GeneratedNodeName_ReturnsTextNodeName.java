package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNodeBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedNodeName_ReturnsTextNodeName {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
        document.append("Hello, World!");
    }

    @Test
    public void nodeName_ReturnsTextNodeName() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("text", node.nodeName());
    }

}