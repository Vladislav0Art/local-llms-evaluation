package org.jsoup.safety;

import org.jsoup.Safelist;
import org.jsoup.helper.Validate;
import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.jsoup.safety.Safelist.simpleText;
import static org.jsoup.safety.Safelist.basic;
import static org.jsoup.safety.Safelist.basicWithImages;
import static org.jsoup.safety.Safelist.relaxed;

public class GeneratedTest_addTags {

    @Test
    public void test_addTags() {
        Safelist safelist = none();
        safelist.addTags("div", "class");
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.getEnforcedAttributes("div").containsKey("class"));
    }

}