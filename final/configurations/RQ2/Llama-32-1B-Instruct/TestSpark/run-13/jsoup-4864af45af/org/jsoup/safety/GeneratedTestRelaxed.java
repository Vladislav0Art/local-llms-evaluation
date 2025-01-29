package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestRelaxed {

    @Test
    public void testRelaxed() {
        Safelist safelist = Safelist.relativelySafe();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeAttribute("a", "href", "/"));
        assertFalse(safelist.isSafeAttribute("script", ""));
    }

}