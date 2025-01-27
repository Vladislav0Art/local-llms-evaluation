package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedOuterHtmlTailDoesNotIncludeNewlines {

    @Test
    public void outerHtmlTailDoesNotIncludeNewlines() throws Exception {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("\nHello\nWorld");
        node.outerHtmlTail(accum, 0, out);
        assertEquals("HelloWorld", accum.toString());
    }

}