package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedText_MultipleSpaces {

    @Test
    public void text_MultipleSpaces() {
        TextNode textNode = new TextNode("   ");
        assertEquals("   ", textNode.text());
    }

}