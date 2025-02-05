package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("body", "style", "margin:0");
        Attributes enforcedAttributes = safelist.getEnforcedAttributes("body");
        assertTrue(enforcedAttributes.hasKey("style"));
        assertEquals("margin:0", enforcedAttributes.get("style"));
    }

}