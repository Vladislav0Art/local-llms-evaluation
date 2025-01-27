package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedOuterHtmlTailNonEmptyTextAppend {

    @Test
    public void outerHtmlTailNonEmptyTextAppend() {
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = null;
        TextNode node = new TextNode(text);
        node.outerHtmlTail(accum, depth, out);
        assertEquals("<p>Hello World</p>", accum.toString());
    }

}