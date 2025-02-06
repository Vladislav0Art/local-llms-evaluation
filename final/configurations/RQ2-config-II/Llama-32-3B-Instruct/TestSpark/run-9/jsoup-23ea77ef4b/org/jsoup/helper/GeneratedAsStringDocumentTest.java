package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() {
        Document doc = new Document();
        String result = org.jsoup.helper.W3CDom.asString(doc);
        assertNotNull(result);
    }

}