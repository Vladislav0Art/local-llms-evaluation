package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedAddTags_[Scenario]

Test {

    @Test
    public void addTags_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addTags("a", "img");
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
    }

}