package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashSet;

public class GeneratedBasic {

    @Test
    public void basic() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeAttribute("b", null, null));
        assertNull(safelist.getEnforcedAttributes("b"));
    }

}