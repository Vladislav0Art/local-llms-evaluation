package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedAddProtocols {

    @Test
    public void addProtocols() {
        Safelist safelist = none();
        safelist.addProtocols("a", "href");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

}