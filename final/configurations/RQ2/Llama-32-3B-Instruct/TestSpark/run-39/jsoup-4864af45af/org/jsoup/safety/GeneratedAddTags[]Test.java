package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddTags[]

Test {

    @Test
    public void addTags[] Test() {
        Safelist safelist = Safelist.addTags("b");
        assertTrue(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeAttribute("i", null, new Attribute()));
    }

}