package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashSet;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeAttribute("div", null, null));
        assertNull(safelist.getEnforcedAttributes("div"));
    }

}