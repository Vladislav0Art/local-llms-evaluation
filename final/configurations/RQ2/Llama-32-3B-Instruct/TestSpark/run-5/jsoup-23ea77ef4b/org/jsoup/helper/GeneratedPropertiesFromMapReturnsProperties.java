package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedPropertiesFromMapReturnsProperties {

    @Test
    public void propertiesFromMapReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties properties = org.jsoup.helper.W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

}