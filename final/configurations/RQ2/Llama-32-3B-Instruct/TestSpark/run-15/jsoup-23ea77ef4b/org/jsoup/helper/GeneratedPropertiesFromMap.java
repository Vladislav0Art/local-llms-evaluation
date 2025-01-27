package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMap {

    @Test
    public void propertiesFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("method", "POST");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

}