package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailNullAppendableTest {

    @Test
    public void outerHtmlTailNullAppendableTest() throws IOException {
        TextNode textNode = new TextNode("test");
        textNode.outerHtmlTail(null, 1, new Document("").outputSettings());
    }

}