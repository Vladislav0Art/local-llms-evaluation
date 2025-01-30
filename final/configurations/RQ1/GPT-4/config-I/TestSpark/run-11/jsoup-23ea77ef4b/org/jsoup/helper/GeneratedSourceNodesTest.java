package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        Document doc = Jsoup.parse("<body><p>Test</p></body>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(doc);
        W3CDom w3CDom = new W3CDom();
        w3cDoc.getDocumentElement().normalize();
        org.w3c.dom.NodeList nodes = w3cDoc.getElementsByTagName("p");

        Assert.assertEquals("Test",
                ((TextNode) w3CDom.sourceNodes(nodes, TextNode.class).get(0)).text());
    }

}