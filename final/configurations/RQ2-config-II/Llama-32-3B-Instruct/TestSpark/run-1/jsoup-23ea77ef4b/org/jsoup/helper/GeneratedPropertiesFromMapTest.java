package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("prop1", "value1");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

}