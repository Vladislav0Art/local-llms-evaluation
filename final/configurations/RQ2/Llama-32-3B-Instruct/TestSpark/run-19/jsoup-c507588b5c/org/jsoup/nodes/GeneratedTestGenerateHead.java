package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGenerateHead {

    @Test
    public void testGenerateHead() {
        // Arrange
        String expected = "<head></head>";
        MyHtmlGenerator generator = new MyHtmlGenerator();

        // Act
        String actual = generator.generateHead();

        // Assert
        assertEquals(expected, actual);
    }

}