package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class GeneratedOuterHtmlTail_accumIsNotEmpty_whenContentExists {

    @Test
    public void outerHtmlTail_accumIsNotEmpty_whenContentExists() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = Document.OutputSettings.builder().build();
        TextNode textNode = new TextNode("test");
        textNode.outerHtmlTail(accum, 0, out);
        assertTrue(accum.length() > 0);
    }

}