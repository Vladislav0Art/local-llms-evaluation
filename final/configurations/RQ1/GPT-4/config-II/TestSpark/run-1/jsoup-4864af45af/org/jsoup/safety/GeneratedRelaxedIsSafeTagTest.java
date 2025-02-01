package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRelaxedIsSafeTagTest {

    @Test
    public void relaxedIsSafeTagTest() {
        Safelist safelist = Safelist.relaxed();
        String tag = "div";
        assertTrue(safelist.isSafeTag(tag));
    }

}