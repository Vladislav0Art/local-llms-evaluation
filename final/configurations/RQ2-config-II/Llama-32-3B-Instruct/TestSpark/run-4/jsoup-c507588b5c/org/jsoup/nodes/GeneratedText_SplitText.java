package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;

public class GeneratedText_SplitText {

    @Test
    public void text_SplitText() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode splitTextNode = textNode.splitText(7);
        assertNotSame(textNode, splitTextNode);
        assertEquals("World!", splitTextNode.text());
    }

}