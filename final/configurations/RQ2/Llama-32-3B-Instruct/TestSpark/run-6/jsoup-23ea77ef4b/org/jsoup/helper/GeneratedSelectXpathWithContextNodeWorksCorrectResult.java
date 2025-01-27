package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedSelectXpathWithContextNodeWorksCorrectResult {

    @Test
    public void selectXpathWithContextNodeWorksCorrectResult() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Node node = doc.createDocumentType("html");
        NodeList nodes = W3CDom.selectXpath("//div", node);
        assertNotNull(nodes);
        assertTrue(nodes instanceof NodeList);
    }

}