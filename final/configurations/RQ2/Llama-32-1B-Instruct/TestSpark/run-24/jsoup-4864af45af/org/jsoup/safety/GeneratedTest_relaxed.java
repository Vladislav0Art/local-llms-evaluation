package org.jsoup.safety;

import org.jsoup.Safelist;
import org.jsoup.helper.Validate;
import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.jsoup.safety.Safelist.simpleText;
import static org.jsoup.safety.Safelist.basic;
import static org.jsoup.safety.Safelist.basicWithImages;
import static org.jsoup.safety.Safelist.relaxed;

public class GeneratedTest_relaxed {

    @Test
    public void test_relaxed() {
        Safelist relaxed = relaxed();
        assertTrue(relaxed.isSafeTag("a"));
        assertFalse(relaxed.isSafeTag("img"));
    }

}