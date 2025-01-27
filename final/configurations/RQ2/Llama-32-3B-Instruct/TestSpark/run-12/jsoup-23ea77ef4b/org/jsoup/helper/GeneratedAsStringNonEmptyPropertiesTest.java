package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsStringNonEmptyPropertiesTest {

    @Test
    public void asStringNonEmptyPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        String result = W3CDom.asString(new Document(), properties);
        assertNotNull(result);
    }

}