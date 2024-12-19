package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_GivenTextNode_ReturnsValidText {

    @Test
    public void text_GivenTextNode_ReturnsValidText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello, World!", textNode.text());
    }

}