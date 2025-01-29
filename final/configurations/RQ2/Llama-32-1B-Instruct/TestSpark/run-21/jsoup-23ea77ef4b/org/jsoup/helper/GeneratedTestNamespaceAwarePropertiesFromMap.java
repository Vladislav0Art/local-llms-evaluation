package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestNamespaceAwarePropertiesFromMap {

    @Test
    public void testNamespaceAwarePropertiesFromMap() {
        W3CDom doc = new W3CDom();
        Properties properties = Properties.fromMap(new HashMap<String, String>() {{
            put("namespace", "http://example.com");
        }});
        assertEquals(1, properties.size());

        Map<String, String> map = null;
        String result = doc.propertiesFromMap(properties);
        assertTrue(map.equals(result));
    }

}