package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedSimpleText[]

Test {

    @Test
    public void simpleText[] Test() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeAttribute("p", null, new Attribute()));
    }

}