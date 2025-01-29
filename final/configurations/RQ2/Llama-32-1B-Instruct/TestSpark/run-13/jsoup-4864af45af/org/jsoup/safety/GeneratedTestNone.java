package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestNone {

    @Test
    public void testNone() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("script"));
    }

}