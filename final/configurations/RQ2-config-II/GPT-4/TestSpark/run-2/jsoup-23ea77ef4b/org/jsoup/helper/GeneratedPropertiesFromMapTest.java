package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedPropertiesFromMapTest {

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<String, String>() {{
            put("format", "pretty");
            put("method", "html");
        }};
        java.util.Properties result = W3CDom.propertiesFromMap(map);
        assertEquals("pretty", result.get("format"));
        assertEquals("html", result.get("method"));
    }

}