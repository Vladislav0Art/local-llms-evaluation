package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNodeBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedClone_ReturnsSameObject {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
        document.append("Hello, World!");
    }

    @Test
    public void clone_ReturnsSameObject() {
        String text = "Hello, World!";
        TextNode node1 = new TextNode(text);
        TextNode node2 = new TextNode(node1);
        assertEquals(node1, node2);
    }

}