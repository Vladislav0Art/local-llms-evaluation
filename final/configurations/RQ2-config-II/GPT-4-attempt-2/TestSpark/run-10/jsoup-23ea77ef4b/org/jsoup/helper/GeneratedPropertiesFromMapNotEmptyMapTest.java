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

public class GeneratedPropertiesFromMapNotEmptyMapTest {

    @Test
    public void propertiesFromMapNotEmptyMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties result = W3CDom.propertiesFromMap(map);
        assertEquals("value", result.getProperty("key"));
    }

}