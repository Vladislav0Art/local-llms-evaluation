package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestRemoveAttributes {

    @Test
    public void testRemoveAttributes() {
        Safelist safelist = new Safelist().basicWithImages();
        safelist.removeAttributes("style");
        assertFalse(Safelist.basicWithImages().isSafeAttribute("a", "href", "/about.html"));
    }

}