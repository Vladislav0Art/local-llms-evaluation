package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_returnsText {

    @Test
    public void text_returnsText() {
        TextNode node = new TextNode("text");
        assertEquals("text", node.text());
    }

}