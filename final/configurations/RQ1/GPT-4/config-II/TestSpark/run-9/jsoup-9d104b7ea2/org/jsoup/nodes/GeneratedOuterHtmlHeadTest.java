package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode(" Hello ");
        Document.OutputSettings out = new Document.OutputSettings();
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, out);

        assertEquals(" Hello ", accum.toString());
    }

}