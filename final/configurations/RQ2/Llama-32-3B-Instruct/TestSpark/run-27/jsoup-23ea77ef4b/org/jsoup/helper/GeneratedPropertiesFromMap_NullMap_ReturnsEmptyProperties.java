package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedPropertiesFromMap_NullMap_ReturnsEmptyProperties {

    @Test
    public void propertiesFromMap_NullMap_ReturnsEmptyProperties() {
        Properties result = W3CDom.propertiesFromMap(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}