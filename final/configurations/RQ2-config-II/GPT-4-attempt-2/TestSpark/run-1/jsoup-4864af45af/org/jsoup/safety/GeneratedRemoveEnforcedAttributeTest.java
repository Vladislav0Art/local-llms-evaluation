package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addEnforcedAttribute("p", "style", "color: red;");
        Attributes attributes = safelist.getEnforcedAttributes("p");
        assertEquals("color: red;", attributes.get("style"));
        safelist.removeEnforcedAttribute("p", "style");
        attributes = safelist.getEnforcedAttributes("p");
        assertFalse(attributes.hasKey("style"));
    }

}