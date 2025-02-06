package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedPreserveRelativeLinks_[Scenario]

Test {

    @Test
    public void preserveRelativeLinks_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        safelist = safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
    }

}