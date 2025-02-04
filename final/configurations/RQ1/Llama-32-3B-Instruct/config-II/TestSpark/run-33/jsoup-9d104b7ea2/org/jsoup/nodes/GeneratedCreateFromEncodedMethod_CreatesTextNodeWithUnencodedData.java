package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;

public class GeneratedCreateFromEncodedMethod_CreatesTextNodeWithUnencodedData {

    @Test
    public void createFromEncodedMethod_CreatesTextNodeWithUnencodedData() throws IOException {
        Document document = Document.parse("<p> &lt;Hello World!&gt;</p>");
        TextNode textNode = new TextNode(document.body().childNodes()[0].toString());
        assertEquals("Hello World!", textNode.text());
    }

}