package org.jsoup.safety;

import static org.jsoup.safety.Safelist.none;
import static org.jsoup.safety.Safelist.simpleText;
import static org.jsoup.safety.Safelist.basic;
import static org.jsoup.safety.Safelist.basicWithImages;
import static org.jsoup.safety.Safelist.relaxed;
import static org.jsoup.safety.Safelist.strict;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class GeneratedRemoveTagsTest {

    Safelist safelist;

    @Before
    public void setup() {
        safelist = new Safelist();
    }

    @Test
    public void removeTagsTest() {
        String[] tags = {"div", "p"};
        safelist.removeTags(tags);

        assertFalse(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeTag("p"));
    }

}