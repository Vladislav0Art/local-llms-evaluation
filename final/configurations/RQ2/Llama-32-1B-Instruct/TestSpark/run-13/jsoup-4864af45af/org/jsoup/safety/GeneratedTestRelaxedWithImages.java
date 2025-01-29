package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestRelaxedWithImages {

    @Test
    public void testRelaxedWithImages() {
        Safelist safelist = Safelist.relativelySafeWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("src", "data-src", ""));
        assertFalse(safelist.isSafeAttribute("script", ""));
    }

}