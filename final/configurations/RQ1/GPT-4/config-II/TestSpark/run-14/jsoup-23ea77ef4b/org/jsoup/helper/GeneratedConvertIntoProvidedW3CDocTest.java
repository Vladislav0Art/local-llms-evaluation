package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class GeneratedConvertIntoProvidedW3CDocTest {

    @Test
    public void convertIntoProvidedW3CDocTest() {
        final org.jsoup.nodes.Document document = Jsoup.parse("<html><head></head><body></body></html>");
        final org.jsoup.nodes.Element body = document.body();
        final W3CDom w3CDom = new W3CDom();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        final Document providedDocument = documentBuilder.newDocument();
        w3CDom.convert(body, providedDocument);
        assertEquals("body", providedDocument.getDocumentElement().getNodeName());
    }

}