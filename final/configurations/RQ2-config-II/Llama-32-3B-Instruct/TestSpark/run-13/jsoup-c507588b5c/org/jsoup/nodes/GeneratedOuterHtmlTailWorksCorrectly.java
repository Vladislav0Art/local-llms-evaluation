package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailWorksCorrectly {

    @Test
    public void outerHtmlTailWorksCorrectly() {
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode(text);
        node.outerHtmlTail(accum, depth, out);
    }

}