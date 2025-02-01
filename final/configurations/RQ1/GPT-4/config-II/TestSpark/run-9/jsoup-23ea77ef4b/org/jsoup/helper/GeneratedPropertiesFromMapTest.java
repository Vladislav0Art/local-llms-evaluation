package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties result = W3CDom.propertiesFromMap(map);
        assertNotNull(result);
        assertEquals("value", result.getProperty("key"));
    }

}