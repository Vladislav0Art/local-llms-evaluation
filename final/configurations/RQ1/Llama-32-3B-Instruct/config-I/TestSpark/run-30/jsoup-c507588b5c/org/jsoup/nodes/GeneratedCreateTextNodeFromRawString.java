package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedCreateTextNodeFromRawString {

    @Test
    public void createTextNodeFromRawString() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

}