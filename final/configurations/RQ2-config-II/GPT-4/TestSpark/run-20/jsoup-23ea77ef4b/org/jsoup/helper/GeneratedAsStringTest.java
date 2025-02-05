package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document document = mock(Document.class);
        Map<String, String> properties = new HashMap<>();
        properties.put("Method", "GET");
        assertTrue(W3CDom.asString(document, properties) instanceof String);
    }

}