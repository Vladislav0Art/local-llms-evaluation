package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasic {

    @Test
    public void basic() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeAttribute("style", null, new Attribute()));
        assertTrue(safelist.isSafeAttribute("title", null, new Attribute()));
    }

}