package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;

public class GeneratedAsString_doc_properties {

    @Test
    public void asString_doc_properties() {
        Map<String, String> properties = new HashMap<>();
        properties.put("attr", "value");
        String expected = "<div attr=\"value\">Text</div>";
        assertEquals(expected, W3CDom.asString(new Document(), properties));
    }

}