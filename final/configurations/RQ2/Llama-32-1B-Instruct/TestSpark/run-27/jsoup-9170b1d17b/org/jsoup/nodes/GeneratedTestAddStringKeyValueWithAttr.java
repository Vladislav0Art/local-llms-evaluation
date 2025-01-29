package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAddStringKeyValueWithAttr {

    @Test
    public void testAddStringKeyValueWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        String value = "test_value";
        when(attributes.put(key, value)).thenReturn(true);
        assertTrue(attributes.addStringKeyValueWithAttr(key, value));
    }

}