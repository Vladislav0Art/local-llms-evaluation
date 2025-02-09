package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedOuterHtmlHead_AppendsHeadContentToOutput {

    @Test
    public void outerHtmlHead_AppendsHeadContentToOutput() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode node = new TextNode("text");
        node.outerHtmlHead(System.out, 1, Document.OutputSettings.DEFAULT);
        assertEquals("<head>text</head>", outContent.toString());
        System.setOut(originalOut);
    }

}