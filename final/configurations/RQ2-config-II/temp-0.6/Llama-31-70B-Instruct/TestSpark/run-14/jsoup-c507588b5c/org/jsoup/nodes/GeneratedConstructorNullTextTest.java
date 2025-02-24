package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConstructorNullTextTest {

    @Test
    public void constructorNullTextTest() {
        // Arrange
        String text = null;

        // Act
        TextNode node = new TextNode(text);

        // Assert
        assertEquals(text, node.text());
    }

}