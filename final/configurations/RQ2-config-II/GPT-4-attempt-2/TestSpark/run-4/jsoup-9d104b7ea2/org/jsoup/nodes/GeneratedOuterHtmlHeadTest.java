package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder sb = new StringBuilder();
        TextNode node = new TextNode("Test Text");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        node.outerHtmlHead(sb, 0, outputSettings);
        Assert.assertEquals("Test Text", sb.toString());
    }

}