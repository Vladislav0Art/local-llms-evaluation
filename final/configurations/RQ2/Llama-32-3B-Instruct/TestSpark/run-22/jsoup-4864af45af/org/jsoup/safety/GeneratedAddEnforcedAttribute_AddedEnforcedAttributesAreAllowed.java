package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedAddEnforcedAttribute_AddedEnforcedAttributesAreAllowed {

    @Test
    public void addEnforcedAttribute_AddedEnforcedAttributesAreAllowed() {
        Safelist safelist = Safelist.addEnforcedAttribute("a", "href", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

}