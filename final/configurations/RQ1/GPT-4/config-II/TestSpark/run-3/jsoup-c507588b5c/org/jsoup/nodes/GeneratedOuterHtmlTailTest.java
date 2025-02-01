package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode(" Hello World ");
        textNode.outerHtmlTail(new StringBuilder(), 0, new Document.OutputSettings());
        // outerHtmlTail call should not change the value
        Assert.assertEquals(" Hello World ", textNode.getWholeText());
    }

}