package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedSelectXpathWithDocTest {

    @Test
    public void selectXpathWithDocTest() {
        String xpath = "/document";
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodeList = w3CDom.selectXpath(xpath, doc);
        assertNotNull(nodeList);
    }

}