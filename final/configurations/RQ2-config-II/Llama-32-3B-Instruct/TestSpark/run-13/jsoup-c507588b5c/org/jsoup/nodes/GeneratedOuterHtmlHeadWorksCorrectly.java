package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadWorksCorrectly {

    @Test
    public void outerHtmlHeadWorksCorrectly() throws IOException {
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode(text);
        node.outerHtmlHead(accum, depth, out);
    }

}