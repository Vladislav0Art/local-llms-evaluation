package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlTailMETHOD_doesNotAddAnything {

    @Test
    public void outerHtmlTailMETHOD_doesNotAddAnything() throws IOException {
        Document document = Document.parse("<p>   Hello World!</p>");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        TextNode textNode = (TextNode) document.body().childNodes()[0];
        textNode.outerHtmlTail(output, 1, null);
        assertEquals("", output.toString());
    }

}