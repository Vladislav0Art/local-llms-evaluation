package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "xml");
        properties.put("indent", "yes");
        properties.put("omit-xml-declaration", "yes");

        String html = "<html><head><title>First parse</title></head><body><p>First html</p></body></html>";
        Document jsoupDoc = Document.createShell(html);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document doc = w3cDom.fromJsoup(jsoupDoc);

        String out = W3CDom.asString(doc, properties);
        assertNotNull(out);
        assertTrue(out.contains("<p>First html</p>"));
    }

}