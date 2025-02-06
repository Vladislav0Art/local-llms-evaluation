package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedAddProtocols_[Scenario]

Test {

    @Test
    public void addProtocols_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        safelist = safelist.addProtocols("img", "src", "https://www.example.com");
        assertTrue(safelist.isEnforcedAttribute("img", null, new Attribute("src", "https://www.example.com")));
    }

}