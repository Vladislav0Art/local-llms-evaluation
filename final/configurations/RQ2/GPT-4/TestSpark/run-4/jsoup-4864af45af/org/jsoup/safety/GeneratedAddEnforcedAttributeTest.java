package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    // Test None Safelist

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Attributes enforcedAttrs = safelist.getEnforcedAttributes("a");
        assertTrue(enforcedAttrs.hasKey("rel"));
        assertEquals("nofollow", enforcedAttrs.get("rel"));
    }

}