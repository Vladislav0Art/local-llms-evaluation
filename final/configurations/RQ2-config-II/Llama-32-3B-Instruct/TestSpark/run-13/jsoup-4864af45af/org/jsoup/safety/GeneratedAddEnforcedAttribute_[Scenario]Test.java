package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedAddEnforcedAttribute_[Scenario]

Test {

    @Test
    public void addEnforcedAttribute_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addEnforcedAttribute("script", "type", "text/javascript");
        assertTrue(safelist.isEnforcedAttribute("script", "type", "text/javascript"));
    }

}