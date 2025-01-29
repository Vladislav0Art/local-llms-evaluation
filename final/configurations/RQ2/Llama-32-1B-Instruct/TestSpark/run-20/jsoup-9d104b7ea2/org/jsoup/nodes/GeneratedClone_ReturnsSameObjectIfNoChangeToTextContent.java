package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNodeBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedClone_ReturnsSameObjectIfNoChangeToTextContent {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
        document.append("Hello, World!");
    }

    @Test
    public void clone_ReturnsSameObjectIfNoChangeToTextContent() {
        String text1 = "Hello, World!";
        String text2 = new TextNode(text1).clone();
        assertEquals(text1, text2);
    }

}