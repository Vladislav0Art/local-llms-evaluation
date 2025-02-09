package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRelaxed[]

Test {

    @Test
    public void relaxed[] Test() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeAttribute("style", null, new Attribute()));
    }

}