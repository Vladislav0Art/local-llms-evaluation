package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestHasValueForKey {

    @Test
    public void testHasValueForKey() {
        Attributes attributes = new Attributes();
        when(attributes.hasValueForKey("key")).thenReturn(false);
        assertFalse(attributes.hasValueForKey("key"));
    }

}