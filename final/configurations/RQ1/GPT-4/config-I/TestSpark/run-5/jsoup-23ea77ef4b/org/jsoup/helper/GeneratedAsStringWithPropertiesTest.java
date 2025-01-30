package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() throws ParserConfigurationException {
        Document in = org.jsoup.Jsoup.parse("<html><head><title>Title</title></head><body>Body</body></html>");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document out = w3CDom.fromJsoup(in);

        Map<String, String> properties = new HashMap<>();
        properties.put("method", "html");
        assertEquals("<html><head><title>Title</title></head><body>Body</body></html>",
                W3CDom.asString(out, properties).trim());
    }

}