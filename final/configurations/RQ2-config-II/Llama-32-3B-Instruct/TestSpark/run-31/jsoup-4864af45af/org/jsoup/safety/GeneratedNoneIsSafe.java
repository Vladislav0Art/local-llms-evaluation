package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedNoneIsSafe {

    @Test
    public void noneIsSafe() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

}