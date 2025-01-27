package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_BasicTagsAndAttributesAreAllowed {

    @Test
    public void basic_BasicTagsAndAttributesAreAllowed() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeAttribute("a", null, null));
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("script"));
    }

}