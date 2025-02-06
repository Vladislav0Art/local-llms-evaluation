package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSimpleTextIsSafe {

    @Test
    public void simpleTextIsSafe() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
    }

}