package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Attributes attributes = new Attributes();
        when(attributes.toString()).thenReturn("some string");
        assertEquals("some string", attributes.toString());
    }

}