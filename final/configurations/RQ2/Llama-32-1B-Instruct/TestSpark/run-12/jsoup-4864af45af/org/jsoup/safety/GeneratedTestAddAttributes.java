package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestAddAttributes {

    @Test
    public void testAddAttributes() {
        Safelist safelist = new Safelist().basicWithImages();
        safelist.addAttributes("style", "{}");
        assertTrue(Safelist.basicWithImages().isSafeAttribute("a", "href", "/about.html"));
    }

}