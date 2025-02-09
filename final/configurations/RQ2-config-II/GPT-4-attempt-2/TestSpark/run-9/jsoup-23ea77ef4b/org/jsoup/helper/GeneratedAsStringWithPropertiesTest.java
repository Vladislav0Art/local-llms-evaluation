package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        Document document = Jsoup.parse("<html></html>").ownerDocument();
        HashMap<String, String> properties = new HashMap<>();
        properties.put(OutputKeys.INDENT, "yes");
        String result = W3CDom.asString(document, properties);
        assertNotNull(result);
    }

}