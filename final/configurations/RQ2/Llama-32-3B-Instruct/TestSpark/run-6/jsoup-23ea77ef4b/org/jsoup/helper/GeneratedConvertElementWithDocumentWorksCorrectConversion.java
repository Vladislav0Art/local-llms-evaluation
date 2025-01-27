package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertElementWithDocumentWorksCorrectConversion {

    @Test
    public void convertElementWithDocumentWorksCorrectConversion() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        org.jsoup.nodes.Element element = doc.createElement("body");
        W3CDom.convert(element, doc);
        assertNotNull(element);
        assertTrue(element instanceof Element);
    }

}