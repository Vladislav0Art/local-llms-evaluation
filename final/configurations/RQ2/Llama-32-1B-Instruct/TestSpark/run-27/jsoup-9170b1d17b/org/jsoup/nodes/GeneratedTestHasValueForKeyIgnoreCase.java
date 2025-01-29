package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestHasValueForKeyIgnoreCase {

    @Test
    public void testHasValueForKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        when(attributes.hasValueForKeyIgnoreCase("key")).thenReturn(false);
        assertFalse(attributes.hasValueForKeyIgnoreCase("Key"));
    }

}