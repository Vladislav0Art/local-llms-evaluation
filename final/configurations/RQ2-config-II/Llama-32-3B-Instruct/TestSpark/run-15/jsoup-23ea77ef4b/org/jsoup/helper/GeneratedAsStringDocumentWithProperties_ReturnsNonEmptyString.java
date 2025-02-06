package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeList;
import org.w3c.dom.DocumentType;

public class GeneratedAsStringDocumentWithProperties_ReturnsNonEmptyString {

    @Test
    public void asStringDocumentWithProperties_ReturnsNonEmptyString() {
        Map<String, String> properties = new HashMap<>();
        properties.put("property1", "value1");
        assertEquals("value1", W3CDom.asString(new Document(), properties));
    }

}