package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncodedCreatesTextNodeFromEncodedString {

    @Test
    public void createFromEncodedCreatesTextNodeFromEncodedString() throws IOException {
        String expectedText = "createFromEncodedText";
        TextNode textNode = TextNode.createFromEncoded(expectedText);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = null;
        assertTrue(textNode != null);
        assertEquals("createFromEncodedText", textNode.getWholeText());
    }

}