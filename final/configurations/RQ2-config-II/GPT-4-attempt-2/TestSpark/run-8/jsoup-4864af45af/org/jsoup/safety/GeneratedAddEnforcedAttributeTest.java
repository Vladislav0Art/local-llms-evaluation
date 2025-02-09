package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("tag").addEnforcedAttribute("tag", "attribute", "value");
        Attributes atttributes = safelist.getEnforcedAttributes("tag");
        assertNotNull(atttributes.get("attribute"));
        assertEquals("value", atttributes.get("attribute"));
    }

}