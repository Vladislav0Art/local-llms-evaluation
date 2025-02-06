package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedNone_[Scenario]

Test {

    @Test
    public void none_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

}