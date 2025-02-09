package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        Document in = new Document("Test");
        org.w3c.dom.Document out = W3CDom.convert(in);

        Map<String, String> properties = new HashMap<>();
        properties.put("indent", "yes");
        properties.put("encoding", "UTF-8");

        String xml = W3CDom.asString(out, properties);
        assertNotNull(xml);
        // Add assertions to check actual XML string.
    }

}