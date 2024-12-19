package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedOuterHtml_GivenTextNodeWithLeadingWhitespaceAndTrailingTrimming_ReturnsCorrectedHTML {

    private final TextNode node1 = new TextNode("Hello World");
    private final TextNode node2 = new TextNode("");
    private final TextNode node3 = new TextNode("\n\n");

    @Test
    public void outerHtml_GivenTextNodeWithLeadingWhitespaceAndTrailingTrimming_ReturnsCorrectedHTML() throws IOException, InterruptedException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(false, true);
        node1.outerHtmlHead(accum, depth, out);
        String correctedText = accum.toString();
        assertEquals("<p>Hello World</p>", correctedText);
    }

}