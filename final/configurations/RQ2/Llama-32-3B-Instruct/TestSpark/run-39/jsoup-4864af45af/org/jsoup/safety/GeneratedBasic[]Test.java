package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasic[]

Test {

    @Test
    public void basic[] Test() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeAttribute("i", null, new Attribute()));
    }

}