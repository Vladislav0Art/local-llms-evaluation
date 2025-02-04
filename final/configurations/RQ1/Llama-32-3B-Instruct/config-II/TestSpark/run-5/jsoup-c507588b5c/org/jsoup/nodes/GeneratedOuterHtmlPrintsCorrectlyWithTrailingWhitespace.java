package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedOuterHtmlPrintsCorrectlyWithTrailingWhitespace {

    @Test
    public void outerHtmlPrintsCorrectlyWithTrailingWhitespace() {
        String expectedOutput = "<p>Hello World!   </p>";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode textNode = new TextNode("Hello World!   ");
        textNode.outerHtmlHead(System.out, 0, Document.OutputSettings.DEFAULT);
        String output = outContent.toString().trim();
        assertEquals(expectedOutput, output);
        System.setOut(originalOut);
    }

}