package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestGetStringForKey {

    @Test
    public void testGetStringForKey() {
        Attributes attributes = new Attributes();
        when(attributes.get("key")).thenReturn("value");
        assertEquals("value", attributes.getString("key"));
    }

}