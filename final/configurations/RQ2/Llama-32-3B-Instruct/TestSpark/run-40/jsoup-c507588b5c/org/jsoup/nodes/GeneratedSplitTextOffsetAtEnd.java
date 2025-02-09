package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSplitTextOffsetAtEnd {

    @Test
    public void splitTextOffsetAtEnd() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        Node result1 = textNode.splitText(text.length());
        assertEquals("", ((TextNode) result1).text());
        assertNull(result1.nextSibling());

        assertNotNull(result1.previousSibling());
    }

}