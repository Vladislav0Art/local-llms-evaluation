package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRemoveEnforcedAttribute_removalOfEnforcedAttributeForTagDoesNotNullify {

    @Test
    public void removeEnforcedAttribute_removalOfEnforcedAttributeForTagDoesNotNullify() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "src", "http://example.com").removeEnforcedAttribute("img", "src");
        assertNotNull(safelist);
        assertFalse((Boolean) ((HashMap<String, String>) safelist.getEnforcedAttributes("img")).get("src"));
    }

}