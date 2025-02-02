package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        // Arrange
        String text = "Hello World";
        Element parent = new Document("", "", document);
        TextNode node = new TextNode(text);

        // Act
        StringBuilder accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();

        // Assert
        assertTrue(accum.toString().contains("    Hello World"));
    }

}