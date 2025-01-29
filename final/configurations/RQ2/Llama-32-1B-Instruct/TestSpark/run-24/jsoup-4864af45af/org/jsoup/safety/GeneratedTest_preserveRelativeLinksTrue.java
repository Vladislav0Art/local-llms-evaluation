package org.jsoup.safety;

import org.jsoup.Safelist;
import org.jsoup.helper.Validate;
import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.jsoup.safety.Safelist.simpleText;
import static org.jsoup.safety.Safelist.basic;
import static org.jsoup.safety.Safelist.basicWithImages;
import static org.jsoup.safety.Safelist.relaxed;

public class GeneratedTest_preserveRelativeLinksTrue {

    @Test
    public void test_preserveRelativeLinksTrue() {
        Safelist safelist = new Safelist(true);
        safelist.preserveRelativeLinks(false);
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("img"));
    }

}