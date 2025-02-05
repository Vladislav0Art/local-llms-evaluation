package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("indent", "yes");
        map.put("omit-xml-declaration", "no");
        map.put("method", "html");

        assertEquals(W3CDom.propertiesFromMap(map).keySet(), map.keySet());
    }

}