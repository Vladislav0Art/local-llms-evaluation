package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document doc = Jsoup.parse("<body><p>Test</p></body>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(doc);
        W3CDom w3CDom = new W3CDom();
        String result = w3CDom.asString(w3cDoc);
        Assert.assertTrue(result.contains("<html><head></head><body><p>Test</p></body></html>"));
    }

}