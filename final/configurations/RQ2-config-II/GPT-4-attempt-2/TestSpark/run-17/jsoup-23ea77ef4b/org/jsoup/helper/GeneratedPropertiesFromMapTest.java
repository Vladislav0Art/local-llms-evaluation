package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    private final W3CDom dom = new W3CDom();

    @Test
    public void PropertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("testKey", "testValue");
        Properties props = W3CDom.propertiesFromMap(map);
        assertTrue(props.containsKey("testKey"));
        assertEquals("testValue", props.get("testKey"));
    }

}