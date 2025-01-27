package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedOuterHtmlHeadNullAppendable {

    @Test
    public void outerHtmlHeadNullAppendable() throws IOException {
        Appendable accum = null;
        Document.OutputSettings out = null;
        TextNode node = new TextNode("Hello World");
        node.outerHtmlHead(accum, 0, out);
        assertNotNull(out);
    }

}