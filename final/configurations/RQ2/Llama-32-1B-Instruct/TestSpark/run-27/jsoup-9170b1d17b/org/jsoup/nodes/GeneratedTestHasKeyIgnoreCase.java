package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestHasKeyIgnoreCase {

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        when(attributes.hasKeyIgnoreCase("key")).thenReturn(true);
        assertTrue(attributes.hasKeyIgnoreCase("Key"));
    }

}