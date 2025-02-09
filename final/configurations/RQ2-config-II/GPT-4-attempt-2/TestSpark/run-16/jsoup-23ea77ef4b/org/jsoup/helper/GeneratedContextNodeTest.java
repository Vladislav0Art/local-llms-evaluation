package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        Document jsoupDoc = new Document();
        org.w3c.dom.Document document = W3CDom.convert(jsoupDoc);
        W3CDom w3cDom = new W3CDom();
        Node result = w3cDom.contextNode(document);
        assertNotNull(result);
    }

}