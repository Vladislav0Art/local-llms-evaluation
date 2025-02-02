package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedText_GivenTextNode_ReturnsUnencodedText {

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        // Arrange
        TextNode textNode = new TextNode("Hello World");
        int expectedLength = "Hello World".length();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String result = textNode.text();

        // Act and Assert
        assertEquals(StringUtil.normaliseWhitespace("Hello World"), result);
        assertEquals(expectedLength, outContent.size());
    }

}