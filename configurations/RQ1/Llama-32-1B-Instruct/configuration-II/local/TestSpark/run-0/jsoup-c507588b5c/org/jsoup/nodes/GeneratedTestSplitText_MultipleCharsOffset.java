package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSplitText_MultipleCharsOffset {

    @Test
    public void testSplitText_MultipleCharsOffset() {
        // Arrange
        String text = "Hello World";
        int offset = 1;
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertTrue(result.splitText(offset).isBlank());
    }

}