package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Properties;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
        assertEquals("value1", properties.getProperty("key1"));
    }

}