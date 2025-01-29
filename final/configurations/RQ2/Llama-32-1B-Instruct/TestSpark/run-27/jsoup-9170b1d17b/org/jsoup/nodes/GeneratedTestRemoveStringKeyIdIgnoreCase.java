package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestRemoveStringKeyIdIgnoreCase {

    @Test
    public void testRemoveStringKeyIdIgnoreCase() {
        Attributes attributes = new Attributes();
        when(attributes.removeIgnoreCase("key")).thenReturn(true);
        assertTrue(attributes.remove("Key").isEmpty());
    }

}