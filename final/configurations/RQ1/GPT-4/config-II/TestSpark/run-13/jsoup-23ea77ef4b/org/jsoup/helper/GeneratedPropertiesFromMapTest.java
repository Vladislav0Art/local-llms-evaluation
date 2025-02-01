package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Text;
import org.w3c.dom.NodeList;

import javax.annotation.Nullable;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathFactoryConfigurationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("test", "value");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
        assertEquals("value", properties.getProperty("test"));
    }

}