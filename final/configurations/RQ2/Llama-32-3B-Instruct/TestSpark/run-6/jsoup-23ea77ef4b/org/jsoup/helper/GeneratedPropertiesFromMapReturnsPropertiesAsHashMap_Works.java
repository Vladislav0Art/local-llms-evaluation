package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedPropertiesFromMapReturnsPropertiesAsHashMap_Works {

    @Test
    public void propertiesFromMapReturnsPropertiesAsHashMap_Works() {
        Map<String, String> map = Map.of();
        Properties props = W3CDom.propertiesFromMap(map);
        assertNotNull(props);
        assertEquals(map, props);
    }

}