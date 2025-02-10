package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Jsoup;

public class GeneratedTestAttributesContainsKey {

    @Test
    public void testAttributesContainsKey() {
        Attributes original = new Attributes();
        Map<String, String> dataset = new HashMap<>();
        dataset.put("key", "value");
        original.dataset().putAll(dataset);

        assertTrue(original.hasKey("key"));
        assertEquals("value", original.get("key"));
    }

}