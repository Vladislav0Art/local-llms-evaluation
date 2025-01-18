package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Sample Text Node");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlHead(sb, 0, new Document("").outputSettings());
        Assert.assertEquals("Sample Text Node", sb.toString());
    }

}