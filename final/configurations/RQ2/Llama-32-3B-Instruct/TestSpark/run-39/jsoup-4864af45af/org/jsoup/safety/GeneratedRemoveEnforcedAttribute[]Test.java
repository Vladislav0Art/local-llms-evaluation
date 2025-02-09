package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveEnforcedAttribute[]

Test {

    @Test
    public void removeEnforcedAttribute[] Test() {
        Safelist safelist = Safelist.removeEnforcedAttribute("img", "alt");
        assertFalse(safelist.isSafeEnforcedAttribute("img", "alt"));
        assertTrue(safelist.isSafeTag("img"));
    }

}