package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_notUsedTest {

    @Test
    public void outerHtmlTail_notUsedTest() {
        TextNode textNode = new TextNode();
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outStream));
        try {
            Document.OutputSettings settings = Document.OutputSettings.builder().prettyPrint(true).build();
            textNode.outerHtmlTail(System.out, 0, settings);
            String output = outStream.toString();
            assertEquals("", output);
        } finally {
            System.setOut(originalOut);
        }
    }

}