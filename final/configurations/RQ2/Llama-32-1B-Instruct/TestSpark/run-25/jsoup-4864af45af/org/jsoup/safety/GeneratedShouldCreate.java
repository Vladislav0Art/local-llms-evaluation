package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldCreate {

    @Test
    public void shouldCreate() {
        BrowserExtension extension = new BrowserExtension();
        assertEquals(0, extension.getEnforcedAttributes("a").size());
    }

}