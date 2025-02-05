package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    W3CDom w3cDom = new W3CDom();

    @Test
    public void asStringWithPropertiesTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();

        Map<String, String> properties = new HashMap<>();
        properties.put(OutputKeys.INDENT, "yes");
        String xmlDocString = W3CDom.asString(xmlDom, properties);

        assertNotNull(xmlDocString);
        assertTrue(xmlDocString.contains("<test>Hello world!</test>"));
    }

}