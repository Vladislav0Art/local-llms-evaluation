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

public class GeneratedAddAttributes_AddAttributeToExistingTag_ReturnsNewSafelist {

    @Test
    public void addAttributes_AddAttributeToExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.addAttributes("b", "style", "color: red;");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("b"));
        assertEquals(1, newSafelist.getEnforcedAttributes("b").size());
    }

}