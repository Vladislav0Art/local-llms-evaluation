package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);

        // Assert
        assertNotNull(textNode);
        assertEquals(text, textNode.value());
    }

}