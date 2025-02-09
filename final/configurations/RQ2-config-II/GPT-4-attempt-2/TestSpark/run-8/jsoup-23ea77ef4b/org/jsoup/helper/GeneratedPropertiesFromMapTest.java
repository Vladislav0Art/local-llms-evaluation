package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> propertiesMap = new HashMap<>();
        propertiesMap.put("indent", "yes");
        propertiesMap.put("standalone", "no");
        Properties properties = W3CDom.propertiesFromMap(propertiesMap);
        assertEquals("yes", properties.getProperty("indent"));
        assertEquals("no", properties.getProperty("standalone"));
    }

}