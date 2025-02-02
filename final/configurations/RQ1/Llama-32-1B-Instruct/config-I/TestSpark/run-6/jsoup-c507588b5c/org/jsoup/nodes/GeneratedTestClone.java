package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Arrange
        String text = "Hello World";
        TextNode node1 = new TextNode(text);
        TextNode node2 = node1.clone();

        // Act
        boolean result = node1.isBlank();
        assertTrue(result);
        assertTrue(node2.isBlank());
    }

}