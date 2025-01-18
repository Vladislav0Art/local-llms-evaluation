package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        Document jsoupDocument = new Document("");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document result = w3CDom.fromJsoup(jsoupDocument);
        Assert.assertNotNull(result);
    }

}