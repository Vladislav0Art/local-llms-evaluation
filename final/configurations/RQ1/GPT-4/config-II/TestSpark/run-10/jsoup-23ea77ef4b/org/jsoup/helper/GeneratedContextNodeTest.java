package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        Document doc = Jsoup.parse("<html><body>Hello world</body></html>");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(doc);
        Node contextNode = w3cDom.contextNode(w3cDoc);
        assertTrue(contextNode instanceof Element);
    }

}