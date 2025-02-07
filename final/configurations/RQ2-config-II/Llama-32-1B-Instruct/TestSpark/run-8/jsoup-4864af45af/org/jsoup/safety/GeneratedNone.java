package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedNone {

    @Test
    public void none() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("div"));
    }

}