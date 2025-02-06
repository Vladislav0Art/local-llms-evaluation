package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedAddEnforcedAttribute_SafelistModification {

    @Test
    public void addEnforcedAttribute_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("a", "href");
        safelist = Safelist.addEnforcedAttribute("a", "href", "https://example.com");
        assertNotNull(safelist);
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("a")).size());
    }

}