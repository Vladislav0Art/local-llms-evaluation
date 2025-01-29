package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAddAllStringKeyValueWithAttr {

    @Test
    public void testAddAllStringKeyValueWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        String value = "test_value";
        when(attributes.addStringKeyValueWithAttr(key, value)).thenReturn(true);
        assertTrue(attributes.addStringKeyValueWithAttr("key", "value"));
        assertEquals(1, attributes.size());
    }

}