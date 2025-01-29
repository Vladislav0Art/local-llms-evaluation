package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCase {

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        when(attributes.hasDeclaredValueForKeyIgnoreCase("key")).thenReturn(false);
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase("Key"));
    }

}