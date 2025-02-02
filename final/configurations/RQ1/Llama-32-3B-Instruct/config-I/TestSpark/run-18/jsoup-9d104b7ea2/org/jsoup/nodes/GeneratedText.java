package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedText {

    @Test
    public void text() {
        // Arrange
        String text = "";
        TextNode node = new TextNode(text);

        // Act and Assert
        assertEquals(text, node.text());
    }

}