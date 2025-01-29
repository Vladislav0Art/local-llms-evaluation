package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Attributes attributes = new Attributes();
        when(attributes.isEmpty()).thenReturn(true);
        assertTrue(attributes.isEmpty());
        attributes.addStringKeyValue("key", "value");
        assertTrue(!attributes.isEmpty());
    }

}