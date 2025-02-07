package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Safelist safelist = none();
        safelist.removeTags("a", "b");
        safelist.removeTags("link", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

}