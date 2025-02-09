package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("indent", "yes");
        map.put("encoding", "UTF-8");

        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals("yes", properties.getProperty("indent"));
        assertEquals("UTF-8", properties.getProperty("encoding"));
    }

}