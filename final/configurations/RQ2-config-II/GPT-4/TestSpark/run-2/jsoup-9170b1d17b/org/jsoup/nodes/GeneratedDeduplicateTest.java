package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("kEY1", "value1");
        attributes.put("kEY1", "value2");
        int duplicates = attributes.deduplicate(null);

        assertEquals(1, duplicates);
        assertEquals("value2", attributes.get("key1"));
    }

}