package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedGetWholeText {

    @Test
    public void getWholeText() {
        // Arrange
        TextNode node = new TextNode("Hello,\nWorld!");

        // Act
        String result = node.getWholeText();

        // Assert
        assertEquals("Hello,\nWorld!", result);
    }

}