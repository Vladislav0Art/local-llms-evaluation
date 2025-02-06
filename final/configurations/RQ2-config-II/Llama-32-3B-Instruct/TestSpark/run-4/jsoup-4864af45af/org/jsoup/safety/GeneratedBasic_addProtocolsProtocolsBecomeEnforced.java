package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedBasic_addProtocolsProtocolsBecomeEnforced {

    @Test
    public void basic_addProtocolsProtocolsBecomeEnforced() {
        Safelist safelist = Safelist.basic();
        Safelist newSafelist = safelist.addProtocols("a", "href", "https://example.com");
        assertTrue(newSafelist.getEnforcedAttributes("a").containsKey("href"));
    }

}