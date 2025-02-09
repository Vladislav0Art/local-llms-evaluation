package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("method", "html");
        map.put("indent", "yes");
        java.util.Properties result = W3CDom.propertiesFromMap(map);
        assertEquals("html", result.getProperty("method"));
        assertEquals("yes", result.getProperty("indent"));
    }

}