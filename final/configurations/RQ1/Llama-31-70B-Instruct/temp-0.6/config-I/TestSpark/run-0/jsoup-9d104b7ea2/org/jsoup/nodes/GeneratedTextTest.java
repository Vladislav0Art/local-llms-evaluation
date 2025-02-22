package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        // Arrange
        String text = "Some text";
        TextNode textNode = new TextNode(text);

        // Act
        String actualText = textNode.text();

        // Assert
        assertEquals("Some text", actualText);
    }

}