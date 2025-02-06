package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSplitText {

    @Test
    public void splitText() {
        TextNode node = new TextNode("Hello World");
        TextNode result1 = (TextNode) node.splitText(0);
        assertEquals("Hello", result1.text());
        assertEquals("World", ((TextNode) node.splitText(result1.length())).text());

        TextNode result2 = (TextNode) node.splitText(6);
        assertNull(result2);
    }

}