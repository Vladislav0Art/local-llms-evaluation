package org.jsoup.safety;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedTestRelaxed_SafeTagsAreRelaxedAndImagesAreAllowed {

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
    public void testRelaxed_SafeTagsAreRelaxedAndImagesAreAllowed() {
        assertFalse(relaxed.isSafeTag("a"));
        assertTrue(relaxed.isSafeTag("img"));
        assertFalse(relaxed.isSafeTag("span"));
    }

}