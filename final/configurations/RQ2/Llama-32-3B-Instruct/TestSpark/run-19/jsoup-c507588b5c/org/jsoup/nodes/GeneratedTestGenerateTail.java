package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGenerateTail {

    @Test
    public void testGenerateTail() {
        // Arrange
        String expected = "</body>";
        MyHtmlGenerator generator = new MyHtmlGenerator();

        // Act
        String actual = generator.generateTail();

        // Assert
        assertEquals(expected, actual);
    }

}