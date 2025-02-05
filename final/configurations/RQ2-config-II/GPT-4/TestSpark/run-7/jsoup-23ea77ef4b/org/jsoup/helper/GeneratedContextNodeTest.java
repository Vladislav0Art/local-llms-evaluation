package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        org.w3c.dom.Document wDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        W3CDom w3CDom = new W3CDom();
        Node contextNode = w3CDom.contextNode(wDoc);
        assertNotNull(contextNode);
    }

}