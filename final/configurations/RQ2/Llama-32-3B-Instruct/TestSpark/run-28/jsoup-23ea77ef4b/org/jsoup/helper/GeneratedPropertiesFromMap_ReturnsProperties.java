package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedPropertiesFromMap_ReturnsProperties {

    @Test
    public void propertiesFromMap_ReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties test = W3CDom.propertiesFromMap(map);
        assertNotNull(test);
    }

}