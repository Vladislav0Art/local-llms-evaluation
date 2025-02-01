package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings().prettyPrint(true));
        assertEquals("test", sb.toString());
    }

}