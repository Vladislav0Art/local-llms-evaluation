package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedOuterHtmlHeadWithParentTest {

    @Test
    public void outerHtmlHeadWithParentTest() throws IOException {
        Element parent = new Element("parent");
        TextNode textNode = new TextNode(" Hello World ");
        parent.appendChild(textNode);
        textNode.outerHtmlHead(new StringBuilder(), 0, new Document.OutputSettings());
        Assert.assertEquals("Hello World", textNode.getWholeText());
    }

}