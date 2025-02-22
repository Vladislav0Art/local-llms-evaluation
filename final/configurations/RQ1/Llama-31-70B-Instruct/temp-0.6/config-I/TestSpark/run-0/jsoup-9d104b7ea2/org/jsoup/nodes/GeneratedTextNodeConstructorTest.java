package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        // Arrange
        String text = "Some text";

        // Act
        TextNode textNode = new TextNode(text);

        // Assert
        assertEquals(text, textNode.coreValue());
    }

}