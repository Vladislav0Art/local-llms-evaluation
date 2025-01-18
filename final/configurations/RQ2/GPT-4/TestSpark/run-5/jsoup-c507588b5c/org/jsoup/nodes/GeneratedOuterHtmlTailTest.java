package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Sample Text Node");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlTail(sb, 0, new Document("").outputSettings());
        Assert.assertEquals("", sb.toString());
    }

}