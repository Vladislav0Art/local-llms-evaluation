package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Document wDoc = w3CDom.contextNode(new Document(""));
        Assert.assertNotNull(wDoc);
    }

}