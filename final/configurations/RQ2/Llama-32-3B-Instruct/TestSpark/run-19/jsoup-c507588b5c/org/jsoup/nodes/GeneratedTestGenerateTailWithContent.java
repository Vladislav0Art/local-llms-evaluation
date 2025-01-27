package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGenerateTailWithContent {

    @Test
    public void testGenerateTailWithContent() {
        // Arrange
        String expected = "</body>Hello World!</body>";
        MyHtmlGenerator generator = new MyHtmlGenerator();

        // Act
        String actual = generator.generateTail("Hello World!");

        // Assert
        assertEquals(expected, actual);
    }

}