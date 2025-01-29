package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestGetAllAttributesWithAttr {

    @Test
    public void testGetAllAttributesWithAttr() {
        Attributes attributes = new Attributes();
        String key = "test_key";
        when(attributes.getStringKeyValues(key)).thenReturn(Attributes.empty());
        assertEquals(0, attributes.size());
    }

}