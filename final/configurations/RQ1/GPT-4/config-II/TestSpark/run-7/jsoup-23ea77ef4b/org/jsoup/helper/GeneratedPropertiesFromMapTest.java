package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals(map.size(), properties.size());
        for (String key : map.keySet()) {
            assertEquals(map.get(key), properties.getProperty(key));
        }
    }

}