package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestDefaultSafeLists {

    @Test
    public void testDefaultSafeLists() {
        assertTrue(Safelist.simpleText().isSafeTag("b"));
        assertTrue(Safelist.basic().isSafeTag("a"));
        assertTrue(Safelist.basicWithImages().isSafeTag("img"));
        assertTrue(Safelist.relaxed().isSafeTag("div"));
    }

}