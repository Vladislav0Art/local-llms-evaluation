package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedNone {

    @Test
    public void none() {
        Safelist safelist = Safelist.nonce();
        assertTrue(safelist.isSafeTag("none"));
        assertFalse(safelist.isSafeAttribute("a", null, null));
    }

}