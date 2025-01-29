package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestRemoveAllStringKeyValue {

    @Test
    public void testRemoveAllStringKeyValue() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.removeStringKey()).thenReturn(true);
        assertTrue(attributes.removeStringKey(key));
        assertFalse(attributes.hasDeclaredValueForKey(key));
        attributes.removeAllStringKeyValue("key");
        assertEquals(0, attributes.size());
    }

}