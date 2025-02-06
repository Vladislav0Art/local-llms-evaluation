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

public class GeneratedSplitTextOffset {

    @Test
    public void splitTextOffset() {
        TextNode node = new TextNode("Hello World");
        TextNode result1 = (TextNode) node.splitText(5);
        assertEquals("World", result1.text());

        TextNode result2 = (TextNode) node.splitText(10);
        assertNull(result2);

        TextNode result3 = (TextNode) node.splitText(node.length());
        assertNull(result3);
    }

}