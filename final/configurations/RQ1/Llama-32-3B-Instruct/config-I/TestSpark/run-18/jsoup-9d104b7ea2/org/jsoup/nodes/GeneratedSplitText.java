package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedSplitText {

    @Test
    public void splitText() {
        // Arrange
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        int offset = 0;

        // Act
        Node tailNode = node.splitText(offset);

        // Assert
        assertEquals("World!", ((TextNode) tailNode).text());
    }

}