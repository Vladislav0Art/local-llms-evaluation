package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringPropertiesTest {

    @Test
    public void asStringPropertiesTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>First parse</title></head><body>Test page</body></html>");
        Document w3cDocument = W3CDom.convert(jsoupDoc);
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "html");
        String str = W3CDom.asString(w3cDocument, properties);
        assertTrue(str.contains("First parse"));
    }

}