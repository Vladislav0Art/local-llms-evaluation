package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText {

    @Test
    public void text() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}