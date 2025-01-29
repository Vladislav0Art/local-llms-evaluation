package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestGetStringIgnoreCaseForKey {

    @Test
    public void testGetStringIgnoreCaseForKey() {
        Attributes attributes = new Attributes();
        when(attributes.getIgnoreCase("key")).thenReturn("value");
        assertEquals("Value", attributes.getStringIgnoreCase("key"));
    }

}