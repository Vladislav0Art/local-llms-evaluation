package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document in = new Document("https://fake-url.com");
        org.w3c.dom.Document out = W3CDom.convert(in);
        W3CDom w3CDom = new W3CDom();
        w3CDom.convert(in, out);
        Assert.assertNotNull(out);
    }

}