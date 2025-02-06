package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedAsString_FromDocumentWithPropertiesTest {

    @Test
    public void asString_FromDocumentWithPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        Document doc = W3CDom.asString(doc, properties);
        assertNotNull(doc);
    }

}