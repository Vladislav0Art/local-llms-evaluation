package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document in = new Document("https://fake-url.com");
        org.w3c.dom.Document doc = W3CDom.convert(in);
        Assert.assertNotNull(W3CDom.asString(doc, new HashMap<>()));
    }

}