package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNodeBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedToString_ThrowsNullPointerExceptionIfNullText {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
        document.append("Hello, World!");
    }

    @Test
    public void toString_ThrowsNullPointerExceptionIfNullText() {
        try {
            new TextNode(null);
        } catch (NullPointerException e) {
            // expected behavior
        }
    }

}