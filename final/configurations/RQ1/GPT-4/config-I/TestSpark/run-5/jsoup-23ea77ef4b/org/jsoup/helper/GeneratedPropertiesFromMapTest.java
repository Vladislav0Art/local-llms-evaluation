package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() throws ParserConfigurationException {
        Map<String, String> map = new HashMap<>();
        map.put("method", "html");
        assertEquals("html", W3CDom.propertiesFromMap(map).get("method"));
    }

}