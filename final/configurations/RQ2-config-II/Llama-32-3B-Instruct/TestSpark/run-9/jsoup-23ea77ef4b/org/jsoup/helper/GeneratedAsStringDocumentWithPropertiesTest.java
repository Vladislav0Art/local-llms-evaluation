package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedAsStringDocumentWithPropertiesTest {

    @Test
    public void asStringDocumentWithPropertiesTest() {
        Document doc = new Document();
        Map<String, String> properties = new HashMap<>();
        String result = org.jsoup.helper.W3CDom.asString(doc, properties);
        assertNotNull(result);
    }

}