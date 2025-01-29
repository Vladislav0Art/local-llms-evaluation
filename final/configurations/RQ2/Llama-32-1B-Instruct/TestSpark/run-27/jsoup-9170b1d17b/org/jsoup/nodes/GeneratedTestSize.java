package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestSize {

    @Test
    public void testSize() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
        attributes.addStringKeyValue("test_key", "test_value");
        assertEquals(1, attributes.size());
    }

}