package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedGetWholeTextReturnsOriginalText {

    @Test
    public void getWholeTextReturnsOriginalText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

}