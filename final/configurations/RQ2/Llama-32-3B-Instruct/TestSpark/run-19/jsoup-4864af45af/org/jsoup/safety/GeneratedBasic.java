package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedBasic {

    @Test
    public void basic() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("table"));
    }

}