package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document doc = new Document();
        Document convertedDoc = org.jsoup.helper.W3CDom.convert(doc);
        assertNotNull(convertedDoc);
    }

}