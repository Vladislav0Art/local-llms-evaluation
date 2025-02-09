package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedPreserveRelativeLinks[]

Test {

    @Test
    public void preserveRelativeLinks[] Test() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute()));
    }

}