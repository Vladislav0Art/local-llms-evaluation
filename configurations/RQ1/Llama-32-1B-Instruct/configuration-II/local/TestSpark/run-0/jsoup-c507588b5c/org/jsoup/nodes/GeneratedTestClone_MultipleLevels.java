package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestClone_MultipleLevels {

    @Test
    public void testClone_MultipleLevels() {
        // Arrange
        String text = "Hello World";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.clone().outerHtmlHead(new Appendable(), 0, Document.OutputSettings()));
    }

}