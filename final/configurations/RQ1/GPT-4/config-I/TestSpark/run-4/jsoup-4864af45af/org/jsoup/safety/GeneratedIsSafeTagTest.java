package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        final Safelist safelist = Safelist.none().addTags("b", "em");
        assertTrue(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeTag("img"));
    }

}