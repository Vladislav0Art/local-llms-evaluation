package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPropertiesFromMapConstructor {

    @Test
    public void propertiesFromMapConstructor() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
        assertEquals("key", properties.getProperty("key"));
    }

}