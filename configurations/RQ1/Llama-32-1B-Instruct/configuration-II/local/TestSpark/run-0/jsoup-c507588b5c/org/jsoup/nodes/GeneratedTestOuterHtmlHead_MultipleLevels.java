package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlHead_MultipleLevels {

    @Test
    public void testOuterHtmlHead_MultipleLevels() {
        // Arrange
        String text = "Hello World";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.outerHtmlHead(new Appendable(), 0, Document.OutputSettings()));
    }

}