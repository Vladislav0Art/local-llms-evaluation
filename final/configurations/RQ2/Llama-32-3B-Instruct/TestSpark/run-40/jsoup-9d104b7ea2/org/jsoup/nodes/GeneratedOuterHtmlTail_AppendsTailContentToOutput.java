package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedOuterHtmlTail_AppendsTailContentToOutput {

    @Test
    public void outerHtmlTail_AppendsTailContentToOutput() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode node = new TextNode("text");
        node.outerHtmlTail(System.out, 1, Document.OutputSettings.DEFAULT);
        assertEquals("</head><body>text</body>", outContent.toString());
        System.setOut(originalOut);
    }

}