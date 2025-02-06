package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedRemoveEnforcedAttribute_[Scenario]

Test {

    @Test
    public void removeEnforcedAttribute_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        safelist = safelist.removeEnforcedAttribute("script", "type");
        assertFalse(safelist.isEnforcedAttribute("script", "type", ""));
    }

}