package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;

public class GeneratedRemoveProtocols_[Scenario]

Test {

    @Test
    public void removeProtocols_[ Scenario]Test() {
        Safelist safelist = Safelist.none();
        safelist = safelist.removeProtocols("img", "src");
        assertFalse(safelist.isEnforcedAttribute("img", null, new Attribute("src", "")));
    }

}