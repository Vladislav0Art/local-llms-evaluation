package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedAddAttributes_[Scenario]

Test {

    @Test
    public void addAttributes_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addAttributes("a", "href", "https://www.example.com");
        assertTrue(safelist.isEnforcedAttribute("a", "href", "https://www.example.com"));
    }

}