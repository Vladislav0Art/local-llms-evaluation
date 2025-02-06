package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        Properties props = W3CDom.propertiesFromMap(map);
        assertNotNull(props);
    }

}