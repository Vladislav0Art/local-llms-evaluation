package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

public class GeneratedPropertiesFromMap_ReturnsProperties {

    @Test
    public void propertiesFromMap_ReturnsProperties() {
        Properties expected = new Properties();
        expected.setProperty("property", "value");
        Properties actual = W3CDom.propertiesFromMap(new HashMap<String, String>() {{
            put("property", "value");
        }});
        assertEquals(expected, actual);
    }

}