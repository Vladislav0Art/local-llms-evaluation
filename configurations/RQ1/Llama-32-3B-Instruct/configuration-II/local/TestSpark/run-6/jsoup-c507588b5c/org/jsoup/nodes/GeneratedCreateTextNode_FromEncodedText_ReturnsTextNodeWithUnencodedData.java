package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedCreateTextNode_FromEncodedText_ReturnsTextNodeWithUnencodedData {

    @Test
    public void createTextNode_FromEncodedText_ReturnsTextNodeWithUnencodedData() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello&gt;");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertTrue(textNode.text().equals("<Hello>"));
    }

}