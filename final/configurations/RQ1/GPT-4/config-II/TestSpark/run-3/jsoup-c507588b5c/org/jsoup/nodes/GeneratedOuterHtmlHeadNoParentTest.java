package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedOuterHtmlHeadNoParentTest {

    @Test
    public void outerHtmlHeadNoParentTest() throws IOException {
        TextNode textNode = new TextNode(" Hello World ");
        textNode.outerHtmlHead(new StringBuilder(), 0, new Document.OutputSettings());
        Assert.assertEquals("Hello World", textNode.getWholeText());
    }

}