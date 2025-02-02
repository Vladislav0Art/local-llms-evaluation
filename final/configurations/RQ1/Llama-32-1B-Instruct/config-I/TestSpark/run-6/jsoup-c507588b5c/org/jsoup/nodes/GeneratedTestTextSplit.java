package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestTextSplit {

    @Test
    public void testTextSplit() {
        // Arrange
        String text = "HelloWorld";
        int offset = 7;
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = new TextNode("World");

        // Act
        TextNode result = node1.splitText(offset);
        Node sibling1 = result.nextSibling();

        // Assert
        assertTrue(sibling1 instanceof TextNode);
        assertTrue(sibling1.text().equals("Hello"));
    }

}