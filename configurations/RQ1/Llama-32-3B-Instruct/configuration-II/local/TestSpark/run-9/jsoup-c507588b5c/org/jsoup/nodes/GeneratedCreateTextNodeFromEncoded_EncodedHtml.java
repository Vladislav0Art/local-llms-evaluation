package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedCreateTextNodeFromEncoded_EncodedHtml {

    @Test
    public void createTextNodeFromEncoded_EncodedHtml() {
        String encodedText = "&lt;test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("test", textNode.text());
    }

}