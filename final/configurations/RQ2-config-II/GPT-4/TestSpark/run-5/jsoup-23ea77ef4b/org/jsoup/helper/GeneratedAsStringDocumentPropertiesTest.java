package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringDocumentPropertiesTest {

    @Test
    public void asStringDocumentPropertiesTest() {
        Document document = W3CDom.convert(new Document(""));
        Map<String, String> properties = new HashMap<>();
        properties.put("indent", "yes");
        assertNotNull(W3CDom.asString(document, properties));
    }

}