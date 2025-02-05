package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedSelectXPathDocumentTest {

    @Test
    public void SelectXPathDocumentTest() {
        String xpath = "/test";
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.NodeList result = w3cDom.selectXpath(xpath, doc);
        Assert.assertNotNull(result);
    }

}