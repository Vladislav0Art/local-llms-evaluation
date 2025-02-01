package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Properties props = W3CDom.propertiesFromMap(map);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

}