package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedRelaxedSafe {

    @Test
    public void relaxedSafe() {
        Safelist safelist = none();
        safelist.addTags("a", "b");
        safelist.preserveRelativeLinks(false);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals(", ", safelist.getEnforcedAttributes("a"));
    }

}