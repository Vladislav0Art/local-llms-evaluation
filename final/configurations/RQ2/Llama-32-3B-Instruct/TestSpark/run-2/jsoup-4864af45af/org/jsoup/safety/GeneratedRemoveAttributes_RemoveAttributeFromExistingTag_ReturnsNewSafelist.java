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

public class GeneratedRemoveAttributes_RemoveAttributeFromExistingTag_ReturnsNewSafelist {

    @Test
    public void removeAttributes_RemoveAttributeFromExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.removeAttributes("b", "style");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("b"));
        assertEquals(0, newSafelist.getEnforcedAttributes("b").size());
    }

}