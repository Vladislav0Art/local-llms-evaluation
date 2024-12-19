package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedIsBlank_GivenTextWithCharacters_ReturnsFalse {

    @Test
    public void isBlank_GivenTextWithCharacters_ReturnsFalse() {
        // Arrange
        String text = "Hello World";

        // Act
        boolean result = new TextNode(text).isBlank();

        // Assert
        assertFalse(result);
    }

}