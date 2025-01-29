package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestHasDeclaredValueForKey {

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        when(attributes.hasDeclaredValueForKey("key")).thenReturn(false);
        assertFalse(attributes.hasDeclaredValueForKey("key"));
    }

}