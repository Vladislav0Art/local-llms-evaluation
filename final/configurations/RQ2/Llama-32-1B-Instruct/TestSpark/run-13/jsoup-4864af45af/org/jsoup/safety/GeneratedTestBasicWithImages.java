package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestBasicWithImages {

    @Test
    public void testBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("src", "data-src", ""));
        assertFalse(safelist.isSafeAttribute("a", "", "href"));
    }

}