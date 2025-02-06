package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedOuterHtmlHeadAccumulatesCorrectly {

    @Test
    public void outerHtmlHeadAccumulatesCorrectly() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("<p>Hello World</p>", accum.toString());
    }

}