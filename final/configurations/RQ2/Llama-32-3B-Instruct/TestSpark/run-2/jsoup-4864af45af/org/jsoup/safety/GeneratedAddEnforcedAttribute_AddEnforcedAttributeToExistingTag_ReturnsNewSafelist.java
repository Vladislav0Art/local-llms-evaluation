package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedAddEnforcedAttribute_AddEnforcedAttributeToExistingTag_ReturnsNewSafelist {

    @Test
    public void addEnforcedAttribute_AddEnforcedAttributeToExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.addEnforcedAttribute("a", "alt", "image.png");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("a"));
        assertEquals(1, newSafelist.getEnforcedAttributes("a").size());
    }

}