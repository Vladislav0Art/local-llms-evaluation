package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

public class GeneratedCreateFromEncoded_nodeIsCreatedWithUnescapedTextTest {

    @Test
    public void createFromEncoded_nodeIsCreatedWithUnescapedTextTest() {
        String encodedText = "&lt;test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("test", textNode.value());
    }

}