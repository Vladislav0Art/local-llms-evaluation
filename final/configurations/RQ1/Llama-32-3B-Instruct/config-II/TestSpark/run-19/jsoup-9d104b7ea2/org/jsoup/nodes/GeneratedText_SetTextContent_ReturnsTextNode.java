package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedText_SetTextContent_ReturnsTextNode {

    @Test
    public void text_SetTextContent_ReturnsTextNode() {
        String text = "Hello World!";
        TextNode node = new TextNode();
        node.text(text);
        assertNotNull(node.value());
        assertEquals(text, StringUtil.normaliseWhitespace(node.text()));
    }

}