package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedSplitTextOffsetGreaterThanZeroTest {

    @Test
    public void splitTextOffsetGreaterThanZeroTest() {
        String text = "ab c";
        TextNode node = new TextNode(text);
        TextNode result = node.splitText(2);
        assertEquals("c", result.text());
        assertEquals("ab ", node.getWholeText().substring(node.splitText(0).splitText(1)));
    }

}