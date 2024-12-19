package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedSplitText_GivenOffset_GivesCorrectResult {

    @Test
    public void splitText_GivenOffset_GivesCorrectResult() {
        // Arrange
        TextNode textNode = new TextNode("Hello World");
        int offset = 5;
        String expectedHead = "Hello ";
        String expectedTail = "World";

        // Act
        TextNode tailNode = textNode.splitText(offset);

        // Assert
        assertEquals(expectedHead, tailNode.value());
        assertNotNull(tailNode.parentNode());
        assertNotNull(tailNode.nextSibling());
    }

}