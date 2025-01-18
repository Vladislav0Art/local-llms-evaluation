package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.dom.DOMSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        org.w3c.dom.Document document = W3CDom.convert(new Document("test"));
        Map<String, String> properties = new HashMap<>();
        properties.put("propertyName", "propertyValue");
        String documentString = W3CDom.asString(document, properties);

        assertNotNull(documentString);
        assertTrue(documentString.contains("propertyValue"));
    }

}