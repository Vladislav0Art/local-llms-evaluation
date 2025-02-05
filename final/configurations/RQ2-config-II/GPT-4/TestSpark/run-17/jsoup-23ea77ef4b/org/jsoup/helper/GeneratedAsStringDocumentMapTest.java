package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedAsStringDocumentMapTest {

    @Test
    public void asStringDocumentMapTest() {
        org.w3c.dom.Document doc = W3CDom.convert(new Document(""));
        Map<String, String> properties = new HashMap<>();
        properties.put("property", "value");
        String actual = W3CDom.asString(doc, properties);
        assertNotNull(actual);
    }

}