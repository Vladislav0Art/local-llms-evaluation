package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConstructorTextTest {

    @Test
    public void constructorTextTest() {
        // Arrange
        String text = "test";

        // Act
        TextNode node = new TextNode(text);

        // Assert
        assertEquals(text, node.text());
    }

}