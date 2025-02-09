package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() throws Exception {
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");

        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
    }

}