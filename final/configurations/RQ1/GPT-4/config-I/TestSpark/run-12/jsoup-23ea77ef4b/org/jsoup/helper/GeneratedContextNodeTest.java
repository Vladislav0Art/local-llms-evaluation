package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.Map;
import java.util.HashMap;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        Element jsoupElement = Jsoup.parse("<html><body><p>Test</p></body></html>").body();
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupElement);
        Assert.assertNotNull(w3cDom.contextNode(w3cDoc));
    }

}