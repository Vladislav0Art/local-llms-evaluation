package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String text = "sample text";
        StringBuilder accum = new StringBuilder();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals(text, accum.toString());
    }

}