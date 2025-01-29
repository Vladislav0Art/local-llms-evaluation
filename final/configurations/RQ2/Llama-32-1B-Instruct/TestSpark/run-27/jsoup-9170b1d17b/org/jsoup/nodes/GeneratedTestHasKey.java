package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestHasKey {

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        when(attributes.hasKey("key")).thenReturn(true);
        assertTrue(attributes.hasKey("key"));
    }

}