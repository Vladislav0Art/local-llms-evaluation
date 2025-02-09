package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadIOExceptionTest {

    @Test
    public void outerHtmlHeadIOExceptionTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        TextNode textNode = new TextNode("Test");
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
    }

}