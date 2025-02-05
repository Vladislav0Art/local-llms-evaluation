package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        org.w3c.dom.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Map<String, String> properties = new HashMap<>();
        properties.put(OutputKeys.INDENT, "yes");
        assertNotNull(W3CDom.asString(document, properties));
    }

}