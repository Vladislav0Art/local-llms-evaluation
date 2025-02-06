package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_ProducesOuterHTML {

    @Test
    public void outerHtmlTail_ProducesOuterHTML() {
        String html = "<script>alert('test');</script>";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNode(html);
        node.outerHtmlTail(accum, 0, out);
        assertEquals("<html><body><script>alert('test');</script></body></html>", accum.toString());
    }

}