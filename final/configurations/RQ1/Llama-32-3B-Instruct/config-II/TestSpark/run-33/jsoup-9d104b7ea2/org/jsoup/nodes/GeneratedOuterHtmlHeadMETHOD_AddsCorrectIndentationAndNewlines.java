package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHeadMETHOD_AddsCorrectIndentationAndNewlines {

    @Test
    public void outerHtmlHeadMETHOD_AddsCorrectIndentationAndNewlines() throws IOException {
        Document document = Document.parse("<p>   Hello World!</p>");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        TextNode textNode = (TextNode) document.body().childNodes()[0];
        textNode.outerHtmlHead(output, 1, null);
        assertEquals("     Hello World!\n", output.toString());
    }

}