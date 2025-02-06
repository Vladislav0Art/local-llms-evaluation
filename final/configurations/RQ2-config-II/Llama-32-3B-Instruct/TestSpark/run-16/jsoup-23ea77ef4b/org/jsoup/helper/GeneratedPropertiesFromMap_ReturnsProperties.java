package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedPropertiesFromMap_ReturnsProperties {

    @Test
    public void propertiesFromMap_ReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties expected = new Properties();
        expected.setProperty("key", "value");
        Properties actual = W3CDom.propertiesFromMap(map);
        assertEquals(expected, actual);
    }

}