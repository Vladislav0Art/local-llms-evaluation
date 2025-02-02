package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedSplitTextOffsetEqualsLengthOfTextTest {

    @Test
    public void splitTextOffsetEqualsLengthOfTextTest() {
        String text = "ab c";
        TextNode node = new TextNode(text);
        TextNode result = node.splitText(text.length());
        assertEquals("", result.text());
        assertEquals("ab", node.getWholeText().substring(0, node.splitText(0).splitText(1)));
    }

}