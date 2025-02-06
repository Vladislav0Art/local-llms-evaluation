package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMap_MockPropertiesFromMap {

    @Test
    public void propertiesFromMap_MockPropertiesFromMap() {
        Map<String, String> map = new HashMap<>();
        Properties expectedProperties = new Properties();
        W3CDom.propertiesFromMap(map);
        assertEquals(expectedProperties, W3CDom.propertiesFromMap(map));
    }

}