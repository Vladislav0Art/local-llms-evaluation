package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSplitText_NoOffset {

    @Test
    public void testSplitText_NoOffset() {
        // Arrange
        String text = "Hello World";
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertFalse(result.splitText(0).isBlank());
    }

}