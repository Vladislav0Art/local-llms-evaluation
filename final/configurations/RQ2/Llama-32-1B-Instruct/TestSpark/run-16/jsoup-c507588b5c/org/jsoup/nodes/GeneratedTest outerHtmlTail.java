package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest outerHtmlTail {

    @Test
    public void test

    outerHtmlTail() {
        // Arrange
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(2048, false);

        // Act
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, depth, out);

        // Assert
        assertEquals("", accum.toString());
    }

}