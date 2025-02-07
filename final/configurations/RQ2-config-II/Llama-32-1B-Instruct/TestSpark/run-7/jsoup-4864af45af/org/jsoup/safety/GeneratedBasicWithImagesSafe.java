package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedBasicWithImagesSafe {

    @Test
    public void basicWithImagesSafe() {
        Safelist safelist = none();
        safelist.addTags("img", "link");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("img"));
        assertEquals("", safelist.getEnforcedAttributes("link"));
    }

}