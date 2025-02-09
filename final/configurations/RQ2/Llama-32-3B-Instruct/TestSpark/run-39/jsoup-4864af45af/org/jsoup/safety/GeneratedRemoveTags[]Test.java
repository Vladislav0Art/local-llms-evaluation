package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveTags[]

Test {

    @Test
    public void removeTags[] Test() {
        Safelist safelist = Safelist.removeTags("script");
        assertFalse(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeAttribute("style", null, new Attribute()));
    }

}