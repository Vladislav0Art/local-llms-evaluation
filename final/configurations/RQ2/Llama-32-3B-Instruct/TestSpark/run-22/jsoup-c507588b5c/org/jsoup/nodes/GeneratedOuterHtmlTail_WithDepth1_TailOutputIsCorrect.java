package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedOuterHtmlTail_WithDepth1_TailOutputIsCorrect {

    @Test
    public void outerHtmlTail_WithDepth1_TailOutputIsCorrect() {
        Document document = Document.create("html");
        Appendable accum = new ByteArrayOutputStream();
        int depth = 1;
        Document.OutputSettings settings = null;
        TextNode node = new TextNode("test");
        node.outerHtmlTail(accum, depth, settings);
        assertEquals("", accumulateToString(accum));
    }

}