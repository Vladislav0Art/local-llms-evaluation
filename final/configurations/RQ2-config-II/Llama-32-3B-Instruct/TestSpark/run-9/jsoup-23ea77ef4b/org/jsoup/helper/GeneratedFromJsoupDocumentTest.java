package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        Document soupDoc = new Document();
        Document convertedDoc = org.jsoup.helper.W3CDom.fromJsoup(soupDoc);
        assertNotNull(convertedDoc);
    }

}