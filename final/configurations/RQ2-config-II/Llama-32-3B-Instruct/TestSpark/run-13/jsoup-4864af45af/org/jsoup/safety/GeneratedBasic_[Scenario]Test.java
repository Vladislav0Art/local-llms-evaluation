package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedBasic_[Scenario]

Test {

    @Test
    public void basic_[ Scenario]Test() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

}