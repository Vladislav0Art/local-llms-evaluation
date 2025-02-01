package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedBasicIsSafeTagTest {

    @Test
    public void basicIsSafeTagTest() {
        Safelist safelist = Safelist.basic();
        String tag = "a";
        assertTrue(safelist.isSafeTag(tag));
    }

}