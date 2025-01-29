package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAddAllAttributesWithoutAttr {

    @Test
    public void testAddAllAttributesWithoutAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.addStringKeyValue(key, "value")).thenReturn(true);
        assertTrue(attributes.addStringKeyValue("key", "value"));
        assertEquals(1, attributes.size());
    }

}