package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedPropertiesFromMap_ReturnsProperties {

    @Test
    public void propertiesFromMap_ReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

}