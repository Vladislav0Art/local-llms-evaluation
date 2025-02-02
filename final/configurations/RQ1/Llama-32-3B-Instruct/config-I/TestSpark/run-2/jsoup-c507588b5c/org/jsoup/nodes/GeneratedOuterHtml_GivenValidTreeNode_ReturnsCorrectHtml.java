package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedOuterHtml_GivenValidTreeNode_ReturnsCorrectHtml {

    @Test
    public void outerHtml_GivenValidTreeNode_ReturnsCorrectHtml() throws IOException {
        // Arrange
        String expectedHtml = "<p>Hello World</p>";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode textNode = new TextNode("Hello World");

        // Act and Assert
        textNode.outerHtmlHead(new StringBuilder(), 0, Document.OutputSettings.STATIC);
        assertEquals(expectedHtml, outContent.toString());
    }

}