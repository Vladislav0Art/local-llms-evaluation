package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        // Arrange
        String text = "Some text";
        TextNode textNode = new TextNode(text);

        // Act
        String actualText = textNode.getWholeText();

        // Assert
        assertEquals("Some text", actualText);
    }

}