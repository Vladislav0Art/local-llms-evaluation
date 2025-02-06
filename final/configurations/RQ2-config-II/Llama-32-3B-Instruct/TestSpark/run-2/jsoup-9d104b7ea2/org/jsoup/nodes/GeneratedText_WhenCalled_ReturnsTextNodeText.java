package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedText_WhenCalled_ReturnsTextNodeText {

    @Test
    public void text_WhenCalled_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}