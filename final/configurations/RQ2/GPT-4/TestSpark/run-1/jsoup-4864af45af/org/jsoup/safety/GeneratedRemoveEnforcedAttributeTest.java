package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "href", "http://example.com");
        safelist.removeEnforcedAttribute("a", "href");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertTrue(attributes.isEmpty());
    }

}