package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNone_Safelist {

    @Test
    public void testNone_Safelist() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("script"));
    }

}