package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedSplitTextOffsetTooHigh {

    @Test
    public void splitTextOffsetTooHigh() {
        // Arrange
        String text = "Hello, World!";
        int offset = 10;
        TextNode node = new TextNode(text);

        // Act and Assert
        try {
            node.splitText(offset);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

}