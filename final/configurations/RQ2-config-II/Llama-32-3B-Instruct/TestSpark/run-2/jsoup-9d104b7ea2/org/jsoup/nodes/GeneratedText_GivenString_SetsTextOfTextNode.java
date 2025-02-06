package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedText_GivenString_SetsTextOfTextNode {

    @Test
    public void text_GivenString_SetsTextOfTextNode() {
        TextNode textNode = new TextNode();
        textNode.text("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}