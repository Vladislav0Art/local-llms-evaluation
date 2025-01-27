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

public class GeneratedRemoveEnforcedAttribute_RemoveEnforcedAttributeFromExistingTag_ReturnsNewSafelist {

    @Test
    public void removeEnforcedAttribute_RemoveEnforcedAttributeFromExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.removeEnforcedAttribute("a", "alt");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("a"));
        assertEquals(0, newSafelist.getEnforcedAttributes("a").size());
    }

}