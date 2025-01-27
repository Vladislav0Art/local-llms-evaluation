package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedOuterHtmlHead_WithDepth1_HtmlOutputIsCorrect {

    @Test
    public void outerHtmlHead_WithDepth1_HtmlOutputIsCorrect() throws IOException {
        Document document = Document.create("html");
        Appendable accum = new ByteArrayOutputStream();
        int depth = 1;
        Document.OutputSettings settings = null;
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, depth, settings);
        assertEquals("<div>test</div>", accumulateToString(accum));
    }

}