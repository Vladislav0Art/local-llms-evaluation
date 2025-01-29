package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAddAllAttributes {

    @Test
    public void testAddAllAttributes() {
        Attributes attributes1 = new Attributes();
        attributes1.addStringKeyValue("key1", "value1");
        when(attributes1.addAll(incoming)).thenReturn(true);
        assertTrue(attributes1.addAll(Attributes.empty()));
        attributes1.removeAllStringKeyValue("key1");
        assertEquals(0, attributes1.size());
    }

}