package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadNullAppendableTest {

    @Test
    public void outerHtmlHeadNullAppendableTest() throws IOException {
        TextNode textNode = new TextNode("test");
        textNode.outerHtmlHead(null, 1, new Document("").outputSettings());
    }

}