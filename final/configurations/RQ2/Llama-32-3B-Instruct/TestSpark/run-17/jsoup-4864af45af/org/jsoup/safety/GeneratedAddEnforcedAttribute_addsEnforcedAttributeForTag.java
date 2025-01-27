package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedAddEnforcedAttribute_addsEnforcedAttributeForTag {

    @Test
    public void addEnforcedAttribute_addsEnforcedAttributeForTag() {
        Safelist safelist = Safelist.simpleText().addEnforcedAttribute("a", "href", "http://example.com");
        assertNotNull(safelist);
        assertEquals(1, ((HashMap<String, String>) safelist.getEnforcedAttributes("a")).size());
    }

}