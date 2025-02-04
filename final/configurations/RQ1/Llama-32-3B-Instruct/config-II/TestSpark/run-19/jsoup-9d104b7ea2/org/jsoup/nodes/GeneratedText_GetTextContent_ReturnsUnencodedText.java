package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedText_GetTextContent_ReturnsUnencodedText {

    @Test
    public void text_GetTextContent_ReturnsUnencodedText() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello World!", StringUtil.normaliseWhitespace(node.text()));
    }

}