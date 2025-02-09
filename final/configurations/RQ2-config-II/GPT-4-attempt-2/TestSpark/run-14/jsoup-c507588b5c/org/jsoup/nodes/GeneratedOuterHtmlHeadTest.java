package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("hello");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new OutputSettings());
        assertEquals("hello", sb.toString());
    }

}