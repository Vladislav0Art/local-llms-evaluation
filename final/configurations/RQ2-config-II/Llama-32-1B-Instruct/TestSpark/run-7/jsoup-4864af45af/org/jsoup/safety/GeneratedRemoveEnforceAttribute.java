package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedRemoveEnforceAttribute {

    @Test
    public void removeEnforceAttribute() {
        Safelist safelist = none();
        safelist.removeEnforceAttribute("style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

}