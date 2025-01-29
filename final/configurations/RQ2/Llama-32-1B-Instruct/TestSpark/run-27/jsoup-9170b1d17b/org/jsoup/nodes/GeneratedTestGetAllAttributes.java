package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestGetAllAttributes {

    @Test
    public void testGetAllAttributes() {
        Attributes attributes = new Attributes();
        String key1 = "test_key1";
        when(attributes.getStringKeyValue(key1)).thenReturn("value1");
        assertEquals(1, attributes.size());
        String value = attributes.getStringValue(key1);
        assertEquals("value1", value);
    }

}