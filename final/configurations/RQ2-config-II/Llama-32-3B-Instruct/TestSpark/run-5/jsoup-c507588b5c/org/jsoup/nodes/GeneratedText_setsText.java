package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_setsText {

    @Test
    public void text_setsText() {
        TextNode node = new TextNode();
        node.text("new text");
        assertEquals("new text", node.text());
    }

}