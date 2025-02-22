package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextWithNewlinesTest {

    @Test
    public void textWithNewlinesTest() {
        // Arrange
        String text = "Some text\n\nAnother text";
        TextNode textNode = new TextNode(text);

        // Act
        String actualText = textNode.text();

        // Assert
        assertEquals("Some text Another text", actualText);
    }

}