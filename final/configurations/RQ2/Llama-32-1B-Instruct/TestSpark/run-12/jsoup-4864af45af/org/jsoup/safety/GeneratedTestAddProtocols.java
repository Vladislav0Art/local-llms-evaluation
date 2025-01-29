package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestAddProtocols {

    @Test
    public void testAddProtocols() {
        Safelist safelist = new Safelist().basicWithImages();
        safelist.addProtocols("a", "title", "My Website");
        assertTrue(Safelist.basicWithImages().isSafeAttribute("a", "href", "/about.html"));
    }

}