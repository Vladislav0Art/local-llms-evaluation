package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNone() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void testSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.isSafeTag("a"));
    }

}