package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedOuterHtmlHeadIncludesWholeText {

    @Test
    public void outerHtmlHeadIncludesWholeText() throws Exception {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("Hello");
        node.outerHtmlHead(accum, 0, out);
        assertEquals("Hello", accum.toString());
    }

}