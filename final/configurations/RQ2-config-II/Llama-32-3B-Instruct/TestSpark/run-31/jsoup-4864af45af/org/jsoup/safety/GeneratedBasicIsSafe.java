package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedBasicIsSafe {

    @Test
    public void basicIsSafe() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("h1"));
    }

}