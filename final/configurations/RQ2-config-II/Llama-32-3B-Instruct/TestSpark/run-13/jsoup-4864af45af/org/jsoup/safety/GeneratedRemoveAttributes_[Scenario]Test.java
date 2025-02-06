package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedRemoveAttributes_[Scenario]

Test {

    @Test
    public void removeAttributes_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        safelist = safelist.removeAttributes("a", "href");
        assertFalse(safelist.isEnforcedAttribute("a", "href", ""));
    }

}