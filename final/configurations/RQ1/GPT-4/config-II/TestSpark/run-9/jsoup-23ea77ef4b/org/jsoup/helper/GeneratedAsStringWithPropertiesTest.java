package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        Document doc = W3CDom.convert(new Node("test"));
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
    }

}