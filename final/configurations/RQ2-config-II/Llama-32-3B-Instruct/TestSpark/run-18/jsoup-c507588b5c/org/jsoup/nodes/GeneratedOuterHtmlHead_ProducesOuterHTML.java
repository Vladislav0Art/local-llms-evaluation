package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_ProducesOuterHTML {

    @Test
    public void outerHtmlHead_ProducesOuterHTML() throws IOException {
        String html = "<p>Hello World!</p>";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNode(html);
        node.outerHtmlHead(accum, 0, out);
        assertEquals("<html><body><p>Hello World!</p></body></html>", accum.toString());
    }

}