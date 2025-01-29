package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestRemoveAllAttributesWithAttr {

    @Test
    public void testRemoveAllAttributesWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.removeStringKeyValue(key)).thenReturn(true);
        assertTrue(attributes.removeStringKeyValue("key"));
        assertFalse(attributes.hasDeclaredValueForKey("key"));
        attributes.removeAllStringKeyValue("key");
        assertEquals(0, attributes.size());
    }

}