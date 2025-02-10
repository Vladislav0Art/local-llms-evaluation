package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Jsoup;

public class GeneratedTestAttributesEqualsSameInstance {

    @Test
    public void testAttributesEqualsSameInstance() {
        Attributes original = new Attributes();
        Map<String, String> dataset = new HashMap<>();
        dataset.put("key", "value");
        original.dataset().putAll(dataset);

        Attributes cloned = new Attributes();
        cloned.dataset().putAll(original.dataset());

        assertNotSame(original, cloned);
        assertEquals(1, cloned.size());
        assertTrue(cloned.hasKey("key"));
        assertEquals("value", cloned.get("key"));
    }
}

public class Document {
    public boolean containsString(String html) {
        return Jsoup.parse(html).body().text().contains(Jsoup.parse("<p>Hello, World!</p>").html());
    }
}

public class Attributes {
    private Map<String, String> dataset = new HashMap<>();

    public void putAll(Map<String, String> dataset) {
        this.dataset.putAll(dataset);
    }

    public boolean hasKey(String key) {
        return dataset.containsKey(key);
    }

    public String get(String key) {
        return dataset.get(key);
    }

}