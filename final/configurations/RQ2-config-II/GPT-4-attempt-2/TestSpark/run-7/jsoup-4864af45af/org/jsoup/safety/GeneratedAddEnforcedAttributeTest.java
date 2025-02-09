package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertTrue(attributes.hasKey("rel"));
        assertEquals("nofollow", attributes.get("rel"));
    }

}