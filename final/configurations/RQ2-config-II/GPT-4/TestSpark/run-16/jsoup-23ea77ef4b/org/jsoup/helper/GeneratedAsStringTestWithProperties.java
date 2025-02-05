package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedAsStringTestWithProperties {

    @Test
    public void asStringTestWithProperties() {
        org.w3c.dom.Document doc = // create an instance
        Map<String, String> properties = new HashMap<>();
        properties.put("prop", "value");
        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
    }

}