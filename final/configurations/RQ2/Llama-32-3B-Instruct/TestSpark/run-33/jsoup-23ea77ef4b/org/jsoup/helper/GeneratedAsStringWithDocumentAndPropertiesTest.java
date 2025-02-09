package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringWithDocumentAndPropertiesTest {

    @Test
    public void asStringWithDocumentAndPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("property1", "value1");

        Document doc = new org.jsoup.nodes.Document();
        String result = W3CDom.asString(doc, properties);

        assertNotNull(result);
    }

}