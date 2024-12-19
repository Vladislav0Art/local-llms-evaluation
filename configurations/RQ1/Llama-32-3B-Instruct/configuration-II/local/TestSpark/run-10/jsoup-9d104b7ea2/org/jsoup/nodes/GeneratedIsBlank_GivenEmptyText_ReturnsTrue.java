package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedIsBlank_GivenEmptyText_ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyText_ReturnsTrue() {
        // Arrange
        String text = "";

        // Act
        boolean result = new TextNode(text).isBlank();

        // Assert
        assertTrue(result);
    }

}