package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        org.w3c.dom.Document w3cDocument = getEmptyW3cDocument();
        Map<String, String> properties = new HashMap<>();
        properties.put("format", "prettyprint");
        String result = W3CDom.asString(w3cDocument, properties);
        assertNotNull(result);
    }

}