package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDoc);
        Assert.assertNotNull(result);
    }

}