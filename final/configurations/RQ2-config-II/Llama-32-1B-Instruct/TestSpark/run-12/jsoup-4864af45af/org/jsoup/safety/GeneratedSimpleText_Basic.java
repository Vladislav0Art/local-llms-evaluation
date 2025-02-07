package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedSimpleText_Basic {

    @Test
    public void simpleText_Basic() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("test", null, null));
        assertFalse(safelist.getEnforcedAttributes("test"));
    }

}