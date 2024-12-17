package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedSplitText_AtEnd {

    @Test
    public void splitText_AtEnd() {
        String text = "hello";
        TextNode node = new TextNode(text);
        int offset = 5;
        TextNode tailNode = node.splitText(offset);
        assertEquals("hello", tailNode.getWholeText());
        assertTrue(node.isBlank());
    }

}