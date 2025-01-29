package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest outerHtmlHead {

    @Test
    public void test

    outerHtmlHead() {
        // Arrange
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(2048, false);

        // Act
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accum, depth, out);

        // Assert
        assertEquals("Hello World", accum.toString());
    }

}