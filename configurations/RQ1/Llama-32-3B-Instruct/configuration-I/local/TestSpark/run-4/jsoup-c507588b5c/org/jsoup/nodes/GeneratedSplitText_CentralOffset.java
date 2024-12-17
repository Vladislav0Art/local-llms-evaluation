package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedSplitText_CentralOffset {

    @Test
    public void splitText_CentralOffset() {
        String text = "hello";
        TextNode node = new TextNode(text);
        int offset = 2;
        TextNode tailNode = node.splitText(offset);
        assertEquals("llo", node.text());
        assertEquals("ell", tailNode.getWholeText());
    }

}