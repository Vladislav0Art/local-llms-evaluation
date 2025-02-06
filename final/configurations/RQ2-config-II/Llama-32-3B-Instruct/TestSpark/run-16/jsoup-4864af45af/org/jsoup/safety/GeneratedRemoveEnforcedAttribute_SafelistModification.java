package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedRemoveEnforcedAttribute_SafelistModification {

    @Test
    public void removeEnforcedAttribute_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("a", "href");
        safelist = Safelist.removeEnforcedAttribute("a", "href");
        assertNotNull(safelist);
        assertEquals(0, ((Attributes) safelist.getEnforcedAttributes("a")).size());
    }

}