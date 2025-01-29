package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestRemoveStringKey {

    @Test
    public void testRemoveStringKey() {
        Attributes attributes = new Attributes();
        when(attributes.remove("key")).thenReturn(true);
        assertTrue(attributes.remove("key"));
    }

}