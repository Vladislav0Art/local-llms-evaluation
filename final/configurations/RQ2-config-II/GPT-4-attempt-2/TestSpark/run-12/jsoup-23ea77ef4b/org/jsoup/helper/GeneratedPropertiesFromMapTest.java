package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void PropertiesFromMapTest() {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("Key", "Value");
        Properties result = W3CDom.propertiesFromMap(testMap);
        assertEquals("Value", result.getProperty("Key"));
    }

}