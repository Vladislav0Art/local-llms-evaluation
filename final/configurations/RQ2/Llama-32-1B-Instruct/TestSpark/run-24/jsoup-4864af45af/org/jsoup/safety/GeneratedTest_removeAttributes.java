package org.jsoup.safety;

import org.jsoup.Safelist;
import org.jsoup.helper.Validate;
import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.jsoup.safety.Safelist.simpleText;
import static org.jsoup.safety.Safelist.basic;
import static org.jsoup.safety.Safelist.basicWithImages;
import static org.jsoup.safety.Safelist.relaxed;

public class GeneratedTest_removeAttributes {

    @Test
    public void test_removeAttributes() {
        Safelist safelist = new Safelist();
        safelist.removeAttributes("img", "class");
        assertFalse(safelist.isSafeTag("div"));
    }

}