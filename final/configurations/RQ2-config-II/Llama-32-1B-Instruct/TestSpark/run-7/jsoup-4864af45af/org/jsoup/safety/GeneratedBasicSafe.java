package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedBasicSafe {

    @Test
    public void basicSafe() {
        Safelist safelist = none();
        safelist.addTags("a", "b");
        safelist.addAttributes("class", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
    }

}