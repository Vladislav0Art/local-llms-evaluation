package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        String docAsString = w3cDom.asString(w3cDoc);
        Assert.assertNotNull(docAsString);
    }

}