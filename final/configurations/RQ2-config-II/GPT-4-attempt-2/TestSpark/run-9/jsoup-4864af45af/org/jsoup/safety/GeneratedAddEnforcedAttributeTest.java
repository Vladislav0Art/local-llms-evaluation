package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attr", "value");
        Attributes attributes = safelist.getEnforcedAttributes("tag");
        assertEquals("value", attributes.get("attr"));
        assertTrue(safelist.isSafeAttribute("tag", null, null));
    }

}