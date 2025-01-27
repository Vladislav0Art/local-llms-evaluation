package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGenerateHeadWithContent {

    @Test
    public void testGenerateHeadWithContent() {
        // Arrange
        String expected = "<head>Hello World!</head>";
        MyHtmlGenerator generator = new MyHtmlGenerator();

        // Act
        String actual = generator.generateHead("Hello World!");

        // Assert
        assertEquals(expected, actual);
    }

}