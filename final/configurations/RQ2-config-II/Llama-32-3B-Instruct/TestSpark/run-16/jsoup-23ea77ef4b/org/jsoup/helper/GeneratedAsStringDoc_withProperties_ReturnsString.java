package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedAsStringDoc_withProperties_ReturnsString {

    @Test
    public void asStringDoc_withProperties_ReturnsString() throws Exception {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        Document in = W3CDom.convert(new org.jsoup.nodes.Document());
        String out = W3CDom.asString(in, properties);
        assertNotNull(out);
    }

}