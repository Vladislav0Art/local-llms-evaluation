package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document("").outputSettings().syntax(Syntax.html));
        assertEquals("Test", accum.toString());
    }

}