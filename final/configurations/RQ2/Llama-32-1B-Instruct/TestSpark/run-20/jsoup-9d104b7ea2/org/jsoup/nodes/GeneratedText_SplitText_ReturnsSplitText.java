package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNodeBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedText_SplitText_ReturnsSplitText {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
        document.append("Hello, World!");
    }

    @Test
    public void text_SplitText_ReturnsSplitText() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(3, node.splitText(0));
        assertEquals("Hello", node.splitText(1));
        assertEquals("", node.splitText(2));
    }

}