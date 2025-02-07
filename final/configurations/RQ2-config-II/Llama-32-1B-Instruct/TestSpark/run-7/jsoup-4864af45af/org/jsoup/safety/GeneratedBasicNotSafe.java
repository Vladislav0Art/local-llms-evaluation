package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedBasicNotSafe {

    @Test
    public void basicNotSafe() {
        Safelist safelist = none();
        safelist.removeTags("a");
        assertEquals(", ", safelist.getEnforcedAttributes("a"));
    }

}