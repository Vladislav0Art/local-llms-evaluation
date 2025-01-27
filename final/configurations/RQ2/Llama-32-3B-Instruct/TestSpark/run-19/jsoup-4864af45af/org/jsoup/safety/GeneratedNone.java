package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedNone {

    @Test
    public void none() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
    }

}