package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedSplitTextChangesTheWholeText {

    @Test
    public void splitTextChangesTheWholeText() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(7);
        assertEquals("", textNode.text());
        assertTrue(result != null);
    }

}