package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        Properties properties = org.jsoup.helper.W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

}