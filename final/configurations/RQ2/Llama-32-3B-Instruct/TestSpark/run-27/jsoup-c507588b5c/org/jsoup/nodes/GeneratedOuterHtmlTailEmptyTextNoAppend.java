package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedOuterHtmlTailEmptyTextNoAppend {

    @Test
    public void outerHtmlTailEmptyTextNoAppend() {
        String text = "";
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = null;
        TextNode node = new TextNode(text);
        node.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}