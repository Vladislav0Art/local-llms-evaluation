package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedPropertiesFromMap_CreatesProperties {

    @Test
    public void propertiesFromMap_CreatesProperties() {
        Map<String, String> map = new HashMap<>();
        map.put("namespace", "http://example.com");
        Properties props = W3CDom.propertiesFromMap(map);
        assertNotNull(props);
        assertEquals("http://example.com", props.getProperty("namespace"));
    }

}