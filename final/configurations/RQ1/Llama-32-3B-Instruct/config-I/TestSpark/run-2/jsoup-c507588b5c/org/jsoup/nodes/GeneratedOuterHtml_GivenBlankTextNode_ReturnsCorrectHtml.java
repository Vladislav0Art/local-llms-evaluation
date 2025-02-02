package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedOuterHtml_GivenBlankTextNode_ReturnsCorrectHtml {

    @Test
    public void outerHtml_GivenBlankTextNode_ReturnsCorrectHtml() throws IOException {
        // Arrange
        String expectedHtml = "<p> </p>";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode textNode = new TextNode("");

        // Act and Assert
        textNode.outerHtmlHead(new StringBuilder(), 0, Document.OutputSettings.STATIC);
        assertEquals(expectedHtml, outContent.toString());
    }

}