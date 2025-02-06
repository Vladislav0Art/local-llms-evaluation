package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveEnforcedAttribute {

    @Test
    public void removeEnforcedAttribute() {
        Safelist safelist = Safelist.addEnforcedAttribute("input", "type", "radio");
        Safelist safelistWithRemovedAttribute = safelist.removeEnforcedAttribute("input", "type");
        assertNull(safelist.getEnforcedAttributes("input").get(0));
    }

}