package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest clone {

    @Test
    public void test

    clone() {
        // Arrange
        String text = "Hello World";
        TextNode expected = new TextNode(text);

        // Act
        TextNode actual = new TextNode(text).clone();

        // Assert
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

}