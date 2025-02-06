package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashSet;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeAttribute("script", null, null));
        assertNull(safelist.getEnforcedAttributes("script"));
    }

}