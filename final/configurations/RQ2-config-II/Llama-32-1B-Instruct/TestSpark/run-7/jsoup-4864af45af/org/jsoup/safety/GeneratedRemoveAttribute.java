package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedRemoveAttribute {

    @Test
    public void removeAttribute() {
        Safelist safelist = none();
        safelist.removeAttributes("class", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

}