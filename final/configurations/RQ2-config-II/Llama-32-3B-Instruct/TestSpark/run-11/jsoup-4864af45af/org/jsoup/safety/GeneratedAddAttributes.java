package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashSet;

public class GeneratedAddAttributes {

    @Test
    public void addAttributes() {
        Safelist safelist = Safelist.addAttributes("div", "style");
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertNull(safelist.getEnforcedAttributes("img"));
    }

}