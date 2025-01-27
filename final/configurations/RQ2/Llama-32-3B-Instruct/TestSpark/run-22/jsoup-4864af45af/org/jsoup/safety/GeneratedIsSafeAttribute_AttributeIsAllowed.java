package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedIsSafeAttribute_AttributeIsAllowed {

    @Test
    public void isSafeAttribute_AttributeIsAllowed() {
        assertTrue(Safelist.basicWithImages().isSafeAttribute("img", null, "src"));
        assertTrue(Safelist.relaxed().isSafeAttribute("noscript", null, null));
    }

}