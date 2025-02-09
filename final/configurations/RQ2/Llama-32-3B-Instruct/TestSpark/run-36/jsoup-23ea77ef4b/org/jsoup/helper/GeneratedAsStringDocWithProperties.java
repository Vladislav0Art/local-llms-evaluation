package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringDocWithProperties {

    @Test
    public void asStringDocWithProperties() {
        Document doc = W3CDom.convert(new org.jsoup.nodes.Document());
        Map<String, String> properties = new HashMap<>();
        properties.put("syntax", Syntax.toString());
        String result = W3CDom.asString(doc, properties);
        assertTrue(result.contains("syntax=\""));
    }

}