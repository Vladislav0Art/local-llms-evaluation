package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Appendable accum = null;
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, depth, out);
        assertEquals("test", new String(accum));
    }

}