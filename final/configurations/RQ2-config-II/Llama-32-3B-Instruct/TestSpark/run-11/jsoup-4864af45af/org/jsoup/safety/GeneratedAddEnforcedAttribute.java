package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashSet;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Safelist safelist = Safelist.addEnforcedAttribute("div", "style", "color: red");
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertEquals("color: red", safelist.getEnforcedAttributes("img").getValue());
    }

}