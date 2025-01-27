package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedRelaxed_RelaxedTagsAndAttributesAreAllowed {

    @Test
    public void relaxed_RelaxedTagsAndAttributesAreAllowed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("script", null, null));
        assertTrue(safelist.isSafeTag("noscript"));
    }

}