package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.TextNodeClone;

public class GeneratedTestSplitText_SplittingToLeft {

    @Test
    public void testSplitText_SplittingToLeft() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode1 = new TextNode(text).splitText(7);

        // Assert
        assertTrue(textNode1.text().contains("World"));
    }

}