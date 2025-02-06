package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedRelaxedIsSafe {

    @Test
    public void relaxedIsSafe() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("video"));
        assertTrue(safelist.isSafeTag("audio"));
    }

}