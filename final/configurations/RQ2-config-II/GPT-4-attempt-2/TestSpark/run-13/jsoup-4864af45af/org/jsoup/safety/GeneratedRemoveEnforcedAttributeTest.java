package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();

        safelist.addEnforcedAttribute("a", "rel", "nofollow");

        assertEquals("nofollow", safelist.getEnforcedAttributes("a").get("rel"));

        safelist.removeEnforcedAttribute("a", "rel");
        assertNull(safelist.getEnforcedAttributes("a").get("rel"));
    }

}