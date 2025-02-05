package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode node = new TextNode("Test TextNode");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, settings);
        Assert.assertEquals("", accum.toString()); // Tail should not append anything
    }

}