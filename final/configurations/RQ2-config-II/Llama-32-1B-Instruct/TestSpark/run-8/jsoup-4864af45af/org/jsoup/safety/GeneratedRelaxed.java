package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("button"));
    }

}