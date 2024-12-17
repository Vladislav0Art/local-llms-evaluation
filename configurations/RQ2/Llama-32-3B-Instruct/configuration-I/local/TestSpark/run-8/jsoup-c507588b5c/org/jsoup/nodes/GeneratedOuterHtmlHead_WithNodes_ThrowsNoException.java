package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedOuterHtmlHead_WithNodes_ThrowsNoException {

    @Test
    public void outerHtmlHead_WithNodes_ThrowsNoException() throws IOException {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        textNode.outerHtmlHead(outContent, 0, outputSettings);
        assertNull(outContent.toString());
    }

}