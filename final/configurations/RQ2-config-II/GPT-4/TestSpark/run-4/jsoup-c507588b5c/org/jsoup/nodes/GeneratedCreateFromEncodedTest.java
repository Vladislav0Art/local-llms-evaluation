package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String htmlEncoded = "Test&nbsp;TextNode";
        TextNode node = TextNode.createFromEncoded(htmlEncoded, false);
        Assert.assertEquals("Test TextNode", node.text());
    }

}