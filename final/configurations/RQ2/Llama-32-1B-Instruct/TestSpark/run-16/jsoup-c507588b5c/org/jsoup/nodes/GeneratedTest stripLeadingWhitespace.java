package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest stripLeadingWhitespace {

    @Test
    public void test

    stripLeadingWhitespace() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello World  ");

        // Act
        String result = TextNode.stripLeadingWhitespace(sb.toString());

        // Assert
        assertEquals("Hello World", result);
    }

}