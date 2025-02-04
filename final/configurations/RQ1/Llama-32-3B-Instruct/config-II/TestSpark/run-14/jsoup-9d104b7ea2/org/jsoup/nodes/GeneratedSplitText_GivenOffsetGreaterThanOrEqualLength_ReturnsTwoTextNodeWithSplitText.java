package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedSplitText_GivenOffsetGreaterThanOrEqualLength_ReturnsTwoTextNodeWithSplitText {

    @Test
    public void splitText_GivenOffsetGreaterThanOrEqualLength_ReturnsTwoTextNodeWithSplitText() throws Exception {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode result = node.splitText(offset);
        assertEquals("Hello", result.text());
        assertEquals("World", node.text());
    }

}