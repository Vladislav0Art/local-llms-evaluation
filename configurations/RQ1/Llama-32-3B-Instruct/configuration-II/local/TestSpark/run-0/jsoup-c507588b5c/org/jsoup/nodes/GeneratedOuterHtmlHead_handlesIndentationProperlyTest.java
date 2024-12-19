package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_handlesIndentationProperlyTest {

    @Test
    public void outerHtmlHead_handlesIndentationProperlyTest() {
        TextNode textNode = new TextNode("\t test");
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outStream));
        try {
            Document.OutputSettings settings = Document.OutputSettings.builder().prettyPrint(true).build();
            textNode.outerHtmlHead(System.out, 0, settings);
            String output = outStream.toString();
            assertTrue(output.contains("    <p>test</p>"));
        } finally {
            System.setOut(originalOut);
        }
    }

}