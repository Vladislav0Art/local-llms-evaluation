package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringBuilder sb = new StringBuilder();
        TextNode node = new TextNode("Test Text");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        node.outerHtmlTail(sb, 0, outputSettings);
        Assert.assertEquals("", sb.toString());
    }

}