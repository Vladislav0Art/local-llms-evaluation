package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSplitText_SingleCharOffset {

    @Test
    public void testSplitText_SingleCharOffset() {
        // Arrange
        String text = "Hello";
        int offset = 1;
        Node parentNode = null;

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertTrue(result.splitText(offset).isBlank());
    }

}