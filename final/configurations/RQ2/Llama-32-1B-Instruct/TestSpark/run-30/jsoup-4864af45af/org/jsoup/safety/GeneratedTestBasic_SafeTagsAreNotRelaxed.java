package org.jsoup.safety;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedTestBasic_SafeTagsAreNotRelaxed {

    private Safelist none;
    private Safelist simpleText;
    private Safelist basic;
    private Safelist basicWithImages;
    private Safelist relaxed;

    @Before
    public void setup() {
        none = new Safelist();
        simpleText = new Safelist(none);
        basic = new Safelist(simpleText);
        basicWithImages = new Safelist(basic);
        relaxed = new Safelist();
    }

    @Test
    public void testBasic_SafeTagsAreNotRelaxed() {
        assertFalse(basic.isSafeTag("a"));
        assertTrue(basic.isSafeTag("img"));
        assertFalse(basic.isSafeTag("span"));
    }

}