package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedRelaxedWithImagesSafe {

    @Test
    public void relaxedWithImagesSafe() {
        Safelist safelist = none();
        safelist.addTags("img", "link");
        safelist.preserveRelativeLinks(false);
        assertEquals("", safelist.getEnforcedAttributes("img"));
        assertEquals("", safelist.getEnforcedAttributes("link"));
    }

}