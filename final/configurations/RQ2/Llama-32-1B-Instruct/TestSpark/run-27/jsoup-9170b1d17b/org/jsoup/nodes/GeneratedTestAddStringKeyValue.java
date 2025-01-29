package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAddStringKeyValue {

    @Test
    public void testAddStringKeyValue() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        String value = "test_value";
        when(attributes.add(key, value)).thenReturn(true);
        assertTrue(attributes.addStringKeyValue(key, value));
    }

}