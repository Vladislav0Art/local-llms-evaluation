package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class GeneratedConvertJsoupDocumentTest {

    @Test
    public void convertJsoupDocumentTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document document = new org.jsoup.nodes.Document("");
        W3CDom w3CDom = new W3CDom();
        Document convertedDocument = w3CDom.fromJsoup(document);
        Assert.assertNotNull(convertedDocument);
    }

}