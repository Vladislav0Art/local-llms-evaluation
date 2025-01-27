package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsStringEmptyPropertiesTest {

    @Test
    public void asStringEmptyPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        String result = W3CDom.asString(new Document(), properties);
        assertEquals("", result);
    }

}