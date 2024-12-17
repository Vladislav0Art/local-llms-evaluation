package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

public class GeneratedIsBlankWithEmptyString {

    @Test
    public void isBlankWithEmptyString() {
        // Arrange
        String text = "";

        // Act and Assert
        assertTrue(TextNode.isBlank(text));
    }

}