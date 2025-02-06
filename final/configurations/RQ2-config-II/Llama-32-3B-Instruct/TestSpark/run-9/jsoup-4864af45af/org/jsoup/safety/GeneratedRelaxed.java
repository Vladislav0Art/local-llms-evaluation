package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("form"));
        assertTrue(safelist.isSafeAttribute("style", null, new Attribute()));
    }

}