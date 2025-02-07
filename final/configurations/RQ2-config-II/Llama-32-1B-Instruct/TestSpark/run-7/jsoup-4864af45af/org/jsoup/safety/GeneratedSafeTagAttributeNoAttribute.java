package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedSafeTagAttributeNoAttribute {

    @Test
    public void safeTagAttributeNoAttribute() {
        Safelist safelist = none();
        safelist.addTags("img", "link");
        safelist.preserveRelativeLinks(true);
        safelist.removeAttributes("style");
        assertEquals("", safelist.getEnforcedAttributes("img"));
        assertEquals("", safelist.getEnforcedAttributes("link"));
    }

}