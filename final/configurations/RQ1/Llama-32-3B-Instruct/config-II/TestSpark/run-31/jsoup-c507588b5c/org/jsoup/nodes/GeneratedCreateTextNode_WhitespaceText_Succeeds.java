package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateTextNode_WhitespaceText_Succeeds {

    @Test
    public void createTextNode_WhitespaceText_Succeeds() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertEquals("text", textNode.nodeName());
        assertEquals(StringUtil.stripLeadingWhitespace(text), textNode.text());
    }

}