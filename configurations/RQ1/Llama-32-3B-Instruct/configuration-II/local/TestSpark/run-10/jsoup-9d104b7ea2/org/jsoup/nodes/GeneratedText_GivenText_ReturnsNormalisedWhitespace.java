package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedText_GivenText_ReturnsNormalisedWhitespace {

    @Test
    public void text_GivenText_ReturnsNormalisedWhitespace() {
        // Arrange
        String text = "   Hello World  ";
        String expected = "Hello World";

        // Act
        String result = TextNode.normaliseWhitespace(text);

        // Assert
        assertEquals(expected, result);
    }

}