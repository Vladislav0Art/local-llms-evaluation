package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedRemoveEnforcedAttribute_RemovedEnforcedAttributesAreDisallowed {

    @Test
    public void removeEnforcedAttribute_RemovedEnforcedAttributesAreDisallowed() {
        Safelist safelist = Safelist.addEnforcedAttribute("script", "src", "https://example.com").removeEnforcedAttribute("script", "src");
        assertFalse(safelist.getEnforcedAttributes("script").containsKey("src"));
    }

}