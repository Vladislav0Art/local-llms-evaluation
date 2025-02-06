package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedRemoveTags_[Scenario]

Test {

    @Test
    public void removeTags_[ Scenario]Test() {
        Safelist safelist = Safelist.basicWithImages();
        safelist = safelist.removeTags("script", "img");
        assertFalse(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("img"));
    }

}