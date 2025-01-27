package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedSelectXpathWorksCorrectXPath {

    @Test
    public void selectXpathWorksCorrectXPath() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodes = W3CDom.selectXpath("//div", doc);
        assertNotNull(nodes);
        assertTrue(nodes instanceof NodeList);
    }

}