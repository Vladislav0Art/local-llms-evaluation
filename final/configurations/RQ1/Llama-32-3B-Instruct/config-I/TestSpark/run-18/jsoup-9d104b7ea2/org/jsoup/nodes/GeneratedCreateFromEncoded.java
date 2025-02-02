package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedCreateFromEncoded {

    @Test
    public void createFromEncoded() {
        // Arrange
        String encodedText = "&lt;Hello, World!&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);

        // Act and Assert
        assertEquals("Hello, World!", node.text());
    }

}