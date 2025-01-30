package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.Map;
import java.util.HashMap;

public class GeneratedTurnOffNamespaceAwarenessTest {

    @Test
    public void turnOffNamespaceAwarenessTest() {
        W3CDom w3cDom = new W3CDom();
        Element jsoupElement = Jsoup.parse("<html><body><p>Test</p></body></html>").body();
        w3cDom.namespaceAware(false);
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupElement);
        Assert.assertFalse(w3cDom.namespaceAware());
    }

}