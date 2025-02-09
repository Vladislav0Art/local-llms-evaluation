package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSplitTextOffsetAtStart {

    @Test
    public void splitTextOffsetAtStart() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        Node result1 = textNode.splitText(0);
        assertEquals("Hello", ((TextNode) result1).text());
        assertNotNull(result1.nextSibling());

        Node result2 = result1.nextSibling();
        assertNull(((TextNode) result2).text());
    }

}