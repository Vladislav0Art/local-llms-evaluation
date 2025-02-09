package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() throws Exception {
        Document document = ...; // create a valid W3C document
        Map<String, String> properties = new HashMap<>();
        properties.put("propKey", "propValue");
        assertNotNull(W3CDom.asString(document, properties));
    }

}