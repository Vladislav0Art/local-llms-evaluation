package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document w3cDoc = dom.fromJsoup(new Document(""));
        Node contextNode = dom.contextNode(w3cDoc);
        Assert.assertNotNull(contextNode);
    }

}