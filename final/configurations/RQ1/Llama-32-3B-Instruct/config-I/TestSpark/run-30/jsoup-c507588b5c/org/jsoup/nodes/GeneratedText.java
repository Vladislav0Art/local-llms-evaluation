package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedText {

    @Test
    public void text() {
        TextNode textNode = new TextNode("Hello World");
        String newText = textNode.text();
        assertEquals(StringUtil.normaliseWhitespace(textNode.text()), newText);
    }

}