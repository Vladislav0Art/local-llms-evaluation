package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedOuterHtmlTail_AppendsToTail {

    @Test
    public void outerHtmlTail_AppendsToTail() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode textNode = new TextNode("test");
        document = textNode.outerHtmlTail(new StringBuilder(), 1, Document.OutputSettings.DEFAULT);
        assertEquals("", outContent.toString());
        System.setOut(originalOut);
    }

}