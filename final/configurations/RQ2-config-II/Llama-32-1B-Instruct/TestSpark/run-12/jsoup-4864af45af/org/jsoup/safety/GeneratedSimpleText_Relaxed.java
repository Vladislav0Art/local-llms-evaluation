package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedSimpleText_Relaxed {

    @Test
    public void simpleText_Relaxed() {
        Safelist safelist = Safelist.relativelyUnsafe();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("test", null, null));
        assertFalse(safelist.getEnforcedAttributes("test"));
    }

}