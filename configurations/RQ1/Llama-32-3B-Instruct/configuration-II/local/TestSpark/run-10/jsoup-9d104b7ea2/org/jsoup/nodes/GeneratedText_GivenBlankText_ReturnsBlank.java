package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedText_GivenBlankText_ReturnsBlank {

    @Test
    public void text_GivenBlankText_ReturnsBlank() {
        // Arrange
        String text = "";

        // Act
        String result = TextNode.normaliseWhitespace(text);

        // Assert
        assertTrue(result.isEmpty());
    }

}