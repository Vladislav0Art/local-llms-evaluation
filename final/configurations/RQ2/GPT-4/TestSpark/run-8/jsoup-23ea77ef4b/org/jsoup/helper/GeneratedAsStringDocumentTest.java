package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() {
        Document in = new Document("https://fake-url.com");
        org.w3c.dom.Document doc = W3CDom.convert(in);
        W3CDom w3CDom = new W3CDom();
        Assert.assertNotNull(w3CDom.asString(doc));
    }

}