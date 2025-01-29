package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldAddAttribute {

    @Test
    public void shouldAddAttribute() {
        BrowserExtension extension = new BrowserExtension();
        extension.addAttribute("a", "href");
        assertEquals(1, extension.getEnforcedAttributes("a").size(), 0.01);
    }

}