package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        // Arrange
        String encodedText = "&lt;";

        // Act
        TextNode result = TextNode.createFromEncoded(encodedText);

        // Assert
        assertEquals("<", result.getWholeText());
    }

}