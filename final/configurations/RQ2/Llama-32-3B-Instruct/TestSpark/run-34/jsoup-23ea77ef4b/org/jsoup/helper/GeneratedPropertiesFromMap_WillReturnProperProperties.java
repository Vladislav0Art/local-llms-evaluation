package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedPropertiesFromMap_WillReturnProperProperties {

    @Test
    public void propertiesFromMap_WillReturnProperProperties() {
        Map<String, String> map = new HashMap<>();
        map.put("property1", "value1");
        map.put("property2", "value2");
        Properties result = W3CDom.propertiesFromMap(map);
        assertNotNull(result);
        assertEquals("value1", result.getProperty("property1"));
        assertEquals("value2", result.getProperty("property2"));
    }

}