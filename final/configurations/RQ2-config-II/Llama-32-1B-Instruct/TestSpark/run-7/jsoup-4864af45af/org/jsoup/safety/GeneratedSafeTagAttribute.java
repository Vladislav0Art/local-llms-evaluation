package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedSafeTagAttribute {

    @Test
    public void safeTagAttribute() {
        Safelist safelist = none();
        safelist.addTags("img", "link");
        safelist.addAttributes("class", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("img"));
        assertEquals("", safelist.getEnforcedAttributes("link"));
    }

}