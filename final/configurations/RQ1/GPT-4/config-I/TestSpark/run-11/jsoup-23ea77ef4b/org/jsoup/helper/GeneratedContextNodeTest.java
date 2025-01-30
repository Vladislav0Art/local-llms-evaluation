package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        Document doc = Jsoup.parse("<body><p>Test</p></body>");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3CDom.fromJsoup(doc);
        Node node = w3CDom.contextNode(w3cDoc);
        Assert.assertNull(node);
    }

}