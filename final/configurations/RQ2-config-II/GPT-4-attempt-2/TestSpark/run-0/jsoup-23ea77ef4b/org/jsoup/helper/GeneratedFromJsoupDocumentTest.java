package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document doc = dom.fromJsoup(jsoupDoc);
        Assert.assertNotNull(doc);
    }

}