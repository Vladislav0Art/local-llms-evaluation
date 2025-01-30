package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.Map;
import java.util.HashMap;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        W3CDom w3cDom = new W3CDom();
        Document jsoupDoc = Jsoup.parse("<html></html>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(jsoupDoc);
        String docString = w3cDom.asString(w3cDoc);

        Assert.assertNotNull(docString);
        Assert.assertTrue(docString.length() > 0);
    }

}