package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.addEnforcedAttribute("tag", "attribute", "value");
        Attributes atttributes = safelist.getEnforcedAttributes("tag");
        assertNotNull(atttributes.get("attribute"));

        safelist.removeEnforcedAttribute("tag", "attribute");
        atttributes = safelist.getEnforcedAttributes("tag");
        assertNull(atttributes.get("attribute"));
    }

}