package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedRelaxed_[Scenario]

Test {

    @Test
    public void relaxed_[ Scenario]Test() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeTag("img"));
    }

}