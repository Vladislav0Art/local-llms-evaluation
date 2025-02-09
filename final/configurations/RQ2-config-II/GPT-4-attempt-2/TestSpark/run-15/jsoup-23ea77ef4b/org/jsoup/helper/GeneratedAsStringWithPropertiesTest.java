package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        Document doc = W3CDom.convert(new Document(""));
        assertNotNull(W3CDom.asString(doc, properties));
    }

}