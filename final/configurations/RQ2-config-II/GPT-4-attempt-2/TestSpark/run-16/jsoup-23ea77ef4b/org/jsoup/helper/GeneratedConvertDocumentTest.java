package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document jsoupDoc = new Document();
        org.w3c.dom.Document document = W3CDom.convert(jsoupDoc);
        assertNotNull(document);
    }

}