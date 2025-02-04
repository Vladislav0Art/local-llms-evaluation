package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class GeneratedOuterHtmlHead_GivenDocumentSettings_ReturnsExpectedString {

    @Test
    public void outerHtmlHead_GivenDocumentSettings_ReturnsExpectedString() {
        String text = "Hello World";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        Document document = new Document();
        TextNode textNode = new TextNode(text);
        document.appendChild(textNode);
        assertEquals("   Hello World  ", TextNode.outerHtmlHead(document, 0, Document.OutputSettings.DEFAULTS).toString());
        System.setOut(originalOut);
    }

}