package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedRemoveAttributes_RemovedAttributesAreDisallowed {

    @Test
    public void removeAttributes_RemovedAttributesAreDisallowed() {
        Safelist safelist = Safelist.addAttributes("script", "src", "https://example.com").removeAttributes("script", "src");
        assertFalse(safelist.getEnforcedAttributes("script").containsKey("src"));
    }

}