package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedPropertiesFromMap_ReturnsProperties {

    @Test
    public void propertiesFromMap_ReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties expected = new Properties();
        expected.setProperty("key", "value");
        assertEquals(expected, W3CDom.propertiesFromMap(map));
    }

}