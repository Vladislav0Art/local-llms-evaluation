package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestHasAttributeWithAttr {

    @Test
    public void testHasAttributeWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.hasStringKeyValue(key)).thenReturn(true);
        assertTrue(attributes.hasStringKeyValue("key"));
        when(attributes.hasStringKeyValue(key)).thenReturn(false);
        assertFalse(attributes.hasStringKeyValue("Key"));
    }

}