package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Appendable;

public class GeneratedText_ForTextNode_ReturnsTextNodeText {

    @Test
    public void text_ForTextNode_ReturnsTextNodeText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}