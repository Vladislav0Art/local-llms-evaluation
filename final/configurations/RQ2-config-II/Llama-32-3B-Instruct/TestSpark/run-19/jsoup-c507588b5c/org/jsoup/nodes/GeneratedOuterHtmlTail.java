package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.html5.OutputSettings;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() {
        StringBuilder accumulator = new StringBuilder();
        int depth = 1;
        Document.OutputSettings outputSettings = new OutputSettings();

        TextNode textNode = new TextNode("text");
        textNode.outerHtmlTail(accumulator, depth, outputSettings);

        assertEquals("", accumulator.toString());
    }

}