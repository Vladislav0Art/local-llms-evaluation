package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Test");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlHead(sb, 0, new Document("").outputSettings());
        Assert.assertEquals("Test", sb.toString());
    }

}