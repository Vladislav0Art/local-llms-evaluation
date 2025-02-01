package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSimpleTextIsSafeTagTest {

    @Test
    public void simpleTextIsSafeTagTest() {
        Safelist safelist = Safelist.simpleText();
        String tag = "em";
        assertTrue(safelist.isSafeTag(tag));
    }

}