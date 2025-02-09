package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddEnforcedAttribute[]

Test {

    @Test
    public void addEnforcedAttribute[] Test() {
        Safelist safelist = Safelist.addEnforcedAttribute("body", "style", "color: red;");
        assertTrue(safelist.getEnforcedAttributes("body").containsKey("style"));
        assertFalse(safelist.isSafeTag("body"));
    }

}